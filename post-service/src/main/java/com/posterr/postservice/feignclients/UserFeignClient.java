package com.posterr.postservice.feignclients;

import com.posterr.postservice.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@Component
@FeignClient(name = "user-service", path = "/users")
public interface UserFeignClient {
    @GetMapping("/{id}")
    ResponseEntity<User> findUserById(@PathVariable UUID id);

    @GetMapping("/random")
    ResponseEntity<User> findRandomUser();
}
