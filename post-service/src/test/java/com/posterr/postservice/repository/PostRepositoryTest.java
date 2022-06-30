package com.posterr.postservice.repository;

import com.posterr.postservice.models.Post;
import com.posterr.postservice.models.enums.PostType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @AfterEach
    void tearDown() {
        postRepository.deleteAll();
    }

    @Test
    void itShouldListAllUserPosts() {
        Post post = new Post();
        post.setContent("Test Content");
        post.setType(PostType.ORIGINAL);
        UUID userId = UUID.randomUUID();
        post.setUserId(userId);
        postRepository.save(post);
        Pageable pageable = PageRequest.of(0, 10);
        List<Post> posts = postRepository.findAllByUserId(userId, pageable);
        assertEquals(1, posts.size());
    }

    @Test
    void itShouldFindAPostById() {
        Post post = new Post();
        post.setContent("Test Content");
        post.setType(PostType.ORIGINAL);
        UUID userId = UUID.randomUUID();
        post.setUserId(userId);
        postRepository.save(post);
        Post foundPost = postRepository.findById(post.getId()).orElse(null);
        assert foundPost != null;
        assertEquals(post.getId(), foundPost.getId());
    }

    @Test
    void itShouldVerifyUserCanPost() {
        UUID userId = UUID.randomUUID();
        Post post1 = createPost(1, userId);
        postRepository.save(post1);
        Boolean canPost = postRepository.userCanPost(userId);
        assertEquals(true, canPost);

        Post post2 = createPost(2, userId);
        Post post3 = createPost(3, userId);
        Post post4 = createPost(4, userId);
        Post post5 = createPost(5, userId);
        Post post6 = createPost(6, userId);

        postRepository.save(post2);
        postRepository.save(post3);
        postRepository.save(post4);
        postRepository.save(post5);
        postRepository.save(post6);

        canPost = postRepository.userCanPost(userId);
        assertEquals(false, canPost);

    }

    private Post createPost(Integer number, UUID userId) {
        Post post = new Post();
        post.setContent("Test Content "+number);
        post.setType(PostType.ORIGINAL);
        post.setUserId(userId);
        return post;
    }
}