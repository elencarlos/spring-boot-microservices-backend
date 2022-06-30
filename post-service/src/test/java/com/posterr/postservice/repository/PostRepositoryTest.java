package com.posterr.postservice.repository;

import com.posterr.postservice.models.Post;
import com.posterr.postservice.models.User;
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

    @Autowired UserRepository userRepository;

    @AfterEach
    void tearDown() {
        postRepository.deleteAll();
    }

    private User createUser(String name, String username) {
        User user = new User();
        user.setName(name);
        user.setUsername(username);
        return user;
    }

    @Test
    void itShouldListAllUserPosts() {
        Post post = new Post();
        post.setContent("Test Content");
        post.setType(PostType.ORIGINAL);
        User user = createUser( "Test Name", "username");
        userRepository.save(user);
        post.setUser(user);
        postRepository.save(post);
        Pageable pageable = PageRequest.of(0, 10);
        List<Post> posts = postRepository.findAllByUserId(user.getId(), pageable);
        assertEquals(1, posts.size());
    }

    @Test
    void itShouldFindAPostById() {
        Post post = new Post();
        post.setContent("Test Content");
        post.setType(PostType.ORIGINAL);
        UUID userId = UUID.randomUUID();
        User user = createUser( "Test Name", "username");
        userRepository.save(user);
        post.setUser(user);
        postRepository.save(post);
        Post foundPost = postRepository.findById(post.getId()).orElse(null);
        assert foundPost != null;
        assertEquals(post.getId(), foundPost.getId());
    }

    @Test
    void itShouldVerifyUserCanPost() {
        User user = createUser("Test Name", "username");
        userRepository.save(user);
        Post post1 = createPost(1, user);
        postRepository.save(post1);
        Boolean canPost = postRepository.userCanPost(user);
        assertEquals(true, canPost);

        Post post2 = createPost(2, user);
        Post post3 = createPost(3, user);
        Post post4 = createPost(4, user);
        Post post5 = createPost(5, user);
        Post post6 = createPost(6, user);

        postRepository.save(post2);
        postRepository.save(post3);
        postRepository.save(post4);
        postRepository.save(post5);
        postRepository.save(post6);

        canPost = postRepository.userCanPost(user);
        assertEquals(false, canPost);

    }

    private Post createPost(Integer number, User user) {
        Post post = new Post();
        post.setContent("Test Content "+number);
        post.setType(PostType.ORIGINAL);
        post.setUser(user);
        return post;
    }
}