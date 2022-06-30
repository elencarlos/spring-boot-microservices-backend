package com.posterr.postservice.resources;

import com.posterr.postservice.PostServiceApplication;
import com.posterr.postservice.models.Post;
import com.posterr.postservice.models.User;
import com.posterr.postservice.models.enums.PostType;
import com.posterr.postservice.repository.PostRepository;
import com.posterr.postservice.repository.UserRepository;
import com.posterr.postservice.util.TestUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.UUID;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = PostServiceApplication.class)
@AutoConfigureMockMvc
class PostResourceTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    private Post newPost(String content, PostType type, User user) {
        Post post = new Post();
        post.setUser(user);
        post.setContent(content);
        post.setType(type);
        post.setContent(content);
        return post;
    }

    @AfterEach
    void tearDown() {
        postRepository.deleteAll();
        userRepository.deleteAll();
    }

    private User createUser(String name, String username) {
        User user = new User();
        user.setName(name);
        user.setUsername(username);
        return user;
    }

    @Test
    void itShouldfindAll() throws Exception {
        User user = createUser( "Test Name", "username");
        userRepository.save(user);
        Post post = newPost("Test", PostType.ORIGINAL, user);
        postRepository.save(post);
        mvc.perform(get("/posts").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.content", hasSize(greaterThanOrEqualTo(1))))
                .andExpect(jsonPath("$.content[0].content").value(post.getContent()))
                .andExpect(jsonPath("$.content[0].type").value(post.getType().toString()))
                .andExpect(jsonPath("$.content[0].user.id").value(post.getUser().getId().toString()))
        ;

        User user2 = createUser( "Test Name 2", "username2");
        userRepository.save(user2);
        Post post2 = newPost("Test2", PostType.ORIGINAL, user2);
        postRepository.save(post2);
        mvc.perform(get("/posts").contentType(MediaType.MULTIPART_MIXED)
                        .param("userId", post2.getUser().getId().toString())
                )
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.content", hasSize(equalTo(1))))
        ;
    }

    @Test
    void itShouldfindWithCriteria() throws Exception {
        User user = createUser( "Test Name", "username");
        userRepository.save(user);
        Post post = newPost("Test", PostType.ORIGINAL, user);
        postRepository.save(post);
        User user2 = createUser("Test Name 2", "username2");
        userRepository.save(user2);
        Post post2 = newPost("Test2", PostType.ORIGINAL, user2);
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
        User user = createUser( "Test Name", "username");
        userRepository.save(user);
        Post post = newPost("Test", PostType.ORIGINAL, user);
        postRepository.save(post);
        mvc.perform(get("/posts/" + post.getId()).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.content").value(post.getContent()))
                .andExpect(jsonPath("$.type").value(post.getType().toString()))
                .andExpect(jsonPath("$.user.id").value(post.getUser().getId().toString()))
        ;
    }

    @Test
    void itShouldCreatePost() throws Exception {
        User user = createUser( "Test Name", "username");
        userRepository.save(user);
        Post post = newPost("Test", PostType.ORIGINAL, user);
        post.setCreatedAt(null);
        post.setUpdatedAt(null);
        user.setCreatedAt(null);
        user.setUpdatedAt(null);
        mvc.perform(post("/posts").contentType(MediaType.APPLICATION_JSON).content(TestUtil.toJson(post)))
                .andExpect(status().isCreated())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.content").value(post.getContent()))
                .andExpect(jsonPath("$.type").value(post.getType().toString()))
                .andExpect(jsonPath("$.user.username").value(post.getUser().getUsername()))
        ;
    }

    @Test
    void itShoudRepostAPost() throws Exception {
        User user = createUser( "Test Name", "username");
        userRepository.save(user);
        Post post = newPost("Test", PostType.ORIGINAL, user);
        postRepository.save(post);
        User user2 = createUser( "Test Name 2", "username2");
        userRepository.save(user2);
        Post post2 = newPost("Repost Test", PostType.REPOST, user2);

        mvc.perform(post("/posts/" + post.getId() + "/repost").contentType(MediaType.APPLICATION_JSON)
                        .content(TestUtil.toJson(user2))
                )
                .andExpect(status().isCreated())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.repost.content").value(post.getContent()))
                .andExpect(jsonPath("$.type").value(post2.getType().toString()))
                .andExpect(jsonPath("$.user.username").value(post2.getUser().getUsername()))
        ;
    }

    @Test
    void iTShouldQuotePost() throws Exception {
        User user = createUser( "Test Name", "username");
        userRepository.save(user);
        Post post = newPost("Test", PostType.ORIGINAL, user);
        postRepository.save(post);
        User user2 = createUser( "Test Name 2", "username2");
        userRepository.save(user2);
        Post post2 = newPost("Quote Test", PostType.QUOTE, user2);

        mvc.perform(post("/posts/" + post.getId() + "/quote").contentType(MediaType.APPLICATION_JSON)
                        .content(TestUtil.toJson(post2))
                )
                .andExpect(status().isCreated())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.quotedPost.content").value(post.getContent()))
                .andExpect(jsonPath("$.type").value(post2.getType().toString()))
                .andExpect(jsonPath("$.content").value(post2.getContent()))
                .andExpect(jsonPath("$.user.username").value(post2.getUser().getUsername()))
        ;
    }
}