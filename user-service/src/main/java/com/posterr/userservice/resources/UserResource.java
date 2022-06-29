package com.posterr.userservice.resources;

import com.posterr.userservice.model.User;
import com.posterr.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    final UserService userService;

    private final Logger LOG = Logger.getLogger(UserResource.class.getName());

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable UUID id) {
        LOG.info("find user by id: " + id);
        return ResponseEntity.ok(userService.findUserById(id));
    }

    @GetMapping(value = "/random")
    public ResponseEntity<User> findRandom() {
        LOG.info("find random user");
        return ResponseEntity.ok(userService.findRandomUser());
    }
}