package com.posterr.postservice.resources;

import com.posterr.postservice.models.Post;
import com.posterr.postservice.service.PostService;
import com.posterr.postservice.service.criteria.PostCriteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    Logger LOGGER = LoggerFactory.getLogger(PostResource.class);
    private static final int DEFAULT_PAGE_NUMBER = 0;
    private static final int DEFAULT_PAGE_SIZE = 10;
    final
    PostService postService;

    public PostResource(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public ResponseEntity<Page<Post>> findAll(PostCriteria criteria,
                                              @PageableDefault(page = DEFAULT_PAGE_NUMBER, size = DEFAULT_PAGE_SIZE)
                                              @SortDefault.SortDefaults({
                                                      @SortDefault(sort = "createdAt", direction = Sort.Direction.DESC)
                                              })
                                              Pageable pageable) {
        LOGGER.info("REST request to find all posts");
        Page<Post> posts = postService.findAllPosts(criteria, pageable);
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable UUID id) {
        LOGGER.info("REST request to find post by id");
        Post post = postService.findPostById(id);
        return ResponseEntity.ok(post);
    }

    @PostMapping
    public ResponseEntity<Post> create(@Valid @RequestBody Post post) {
        LOGGER.info("REST request to create post");
        Post newPost = postService.createPost(post);
        return ResponseEntity.ok(newPost);
    }
}
