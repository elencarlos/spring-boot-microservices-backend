package com.posterr.userservice.repository;

import com.posterr.userservice.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @AfterEach
    void tearDown() {
        userRepository.deleteAll();
    }

    @Test
    void itShouldFindUserById() {
        User user = new User();
        user.setUsername("test1");
        user.setEmail("email1@email.com");
        user.setName("test1");
        userRepository.save(user);
        User foundUser = userRepository.findById(user.getId()).orElse(null);
        assert foundUser != null;
        assertEquals(user.getId(), foundUser.getId());
    }

    @Test
    void itShouldFindUserByUsername() {
        User user = new User();
        user.setUsername("test2");
        user.setEmail("email2@email.com");
        user.setName("test2");
        userRepository.save(user);
        User foundUser = userRepository.findByUsername(user.getUsername()).orElse(null);
        assert foundUser != null;
        assertEquals(user.getUsername(), foundUser.getUsername());
    }
}