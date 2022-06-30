package com.posterr.postservice.resources;

import com.posterr.postservice.PostServiceApplication;
import com.posterr.postservice.models.Post;
import com.posterr.postservice.models.enums.PostType;
import com.posterr.postservice.repository.PostRepository;
import com.posterr.postservice.util.TestUtil;
import org.joda.time.Period;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.MultiValueMapAdapter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = PostServiceApplication.class)
@AutoConfigureMockMvc
class PostResourceTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private PostRepository postRepository;

    private Post newPost(String content, PostType type, UUID userId) {
        Post post = new Post();
        post.setUserId(userId);
        post.setContent(content);
        post.setType(type);
        post.setContent(content);
        return post;
    }

    @AfterEach
    void tearDown() {
        postRepository.deleteAll();
    }

    @Test
    void itShouldfindAll() throws Exception {
        UUID userId = UUID.randomUUID();
        Post post = newPost("Test", PostType.ORIGINAL, userId);
        postRepository.save(post);
        mvc.perform(get("/posts").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.content", hasSize(greaterThanOrEqualTo(1))))
                .andExpect(jsonPath("$.content[0].content").value(post.getContent()))
                .andExpect(jsonPath("$.content[0].type").value(post.getType().toString()))
                .andExpect(jsonPath("$.content[0].userId").value(post.getUserId().toString()))
        ;

        UUID userId2 = UUID.randomUUID();
        Post post2 = newPost("Test2", PostType.ORIGINAL, userId2);
        postRepository.save(post2);
        mvc.perform(get("/posts").contentType(MediaType.MULTIPART_MIXED)
                        .param("userId", userId2.toString())
                )
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.content", hasSize(equalTo(1))))
        ;
    }

    @Test
    void itShouldfindWithCriteria() throws Exception {
        UUID userId = UUID.randomUUID();
        Post post = newPost("Test", PostType.ORIGINAL, userId);
        postRepository.save(post);
        UUID userId2 = UUID.randomUUID();
        Post post2 = newPost("Test2", PostType.ORIGINAL, userId2);
        postRepository.save(post2);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        mvc.perform(get("/posts").contentType(MediaType.MULTIPART_MIXED)
                        .param("createdAtGreaterThan", yesterday.toString())
                        .param("createdAtLessThan", tomorrow.toString())
                )
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.content", hasSize(equalTo(2))))
        ;
    }

    @Test
    void itShouldfindPostById() throws Exception {
        UUID userId = UUID.randomUUID();
        Post post = newPost("Test", PostType.ORIGINAL, userId);
        postRepository.save(post);
        mvc.perform(get("/posts/" + post.getId()).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.content").value(post.getContent()))
                .andExpect(jsonPath("$.type").value(post.getType().toString()))
                .andExpect(jsonPath("$.userId").value(post.getUserId().toString()))
        ;
    }

    @Test
    void itShouldCreatePost() throws Exception {
        UUID userId = UUID.randomUUID();
        Post post = newPost("Test", PostType.ORIGINAL, userId);
        post.setCreatedAt(null);
        post.setUpdatedAt(null);
        mvc.perform(post("/posts").contentType(MediaType.APPLICATION_JSON).content(TestUtil.toJson(post)))
                .andExpect(status().isCreated())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.content").value(post.getContent()))
                .andExpect(jsonPath("$.type").value(post.getType().toString()))
                .andExpect(jsonPath("$.userId").value(post.getUserId().toString()))
        ;
    }

    @Test
    void itShoudRepostAPost() throws Exception {
        UUID userId = UUID.randomUUID();
        Post post = newPost("Test", PostType.ORIGINAL, userId);
        postRepository.save(post);
        UUID userId2 = UUID.randomUUID();
        Post post2 = newPost("Repost Test", PostType.REPOST, userId2);

        mvc.perform(post("/posts/" + post.getId() + "/repost").contentType(MediaType.MULTIPART_FORM_DATA)
                        .queryParam("userId", post2.getUserId().toString())
                )
                .andExpect(status().isCreated())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.repost.content").value(post.getContent()))
                .andExpect(jsonPath("$.type").value(post2.getType().toString()))
                .andExpect(jsonPath("$.userId").value(post2.getUserId().toString()))
        ;
    }

    @Test
    void iTShouldQuotePost() throws Exception {
        UUID userId = UUID.randomUUID();
        Post post = newPost("Test", PostType.ORIGINAL, userId);
        postRepository.save(post);
        UUID userId2 = UUID.randomUUID();
        Post post2 = newPost("Quote Test", PostType.QUOTE, userId2);

        mvc.perform(post("/posts/" + post.getId() + "/quote").contentType(MediaType.MULTIPART_FORM_DATA)
                        .queryParam("userId", post2.getUserId().toString())
                        .queryParam("content", post2.getContent())
                )
                .andExpect(status().isCreated())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.quotedPost.content").value(post.getContent()))
                .andExpect(jsonPath("$.type").value(post2.getType().toString()))
                .andExpect(jsonPath("$.content").value(post2.getContent()))
                .andExpect(jsonPath("$.userId").value(post2.getUserId().toString()))
        ;
    }
}