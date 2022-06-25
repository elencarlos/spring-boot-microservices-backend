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

    private Logger logger = Logger.getLogger(UserResource.class.getName());

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<String> findAll() {
        return ResponseEntity.ok("Hello User");
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable UUID id) {
        logger.info("findById: " + id);
        return ResponseEntity.ok(userService.findUserById(id));
    }
}