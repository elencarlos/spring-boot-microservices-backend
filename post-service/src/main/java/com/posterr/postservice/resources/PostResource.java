package com.posterr.postservice.resources;

import com.posterr.postservice.feignclients.UserFeignClient;
import com.posterr.postservice.models.Post;
import com.posterr.postservice.models.User;
import com.posterr.postservice.models.enums.PostType;
import com.posterr.postservice.service.PostService;
import com.posterr.postservice.service.criteria.PostCriteria;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    final PostService postService;

    final UserFeignClient userFeignClient;

    public PostResource(PostService postService, UserFeignClient userFeignClient) {
        this.postService = postService;
        this.userFeignClient = userFeignClient;
    }

    @Operation(summary = "List all posts")
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

    @Operation(summary = "Find a post by Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the post",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Post.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Post not found",
                    content = @Content) })
    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable UUID id) {
        LOGGER.info("REST request to find post by id");
        Post post = postService.findPostById(id);
        return ResponseEntity.ok(post);
    }

    @Operation(summary = "Create a post")
    @PostMapping
    public ResponseEntity<Post> create(@Valid @RequestBody Post post) {
        LOGGER.info("REST request to create post");
        post.setType(PostType.ORIGINAL);
        Post newPost = postService.createPost(post);
        return ResponseEntity.ok(newPost);
    }

    @Operation(summary = "Create a repost")
    @PostMapping("/{id}/repost")
    public ResponseEntity<Post> repost(@PathVariable UUID id) {
        LOGGER.info("REST request to repost post");
        Post toRepost = postService.findPostById(id);
        Post post = new Post();
        post.setType(PostType.REPOST);
        post.setUserId(getSimulatedAutheticatedUser().getId());
        post.setRepost(toRepost);
        toRepost.setRepostCount(toRepost.getRepostCount() + 1);
        postService.createPost(post);
        postService.updatePost(toRepost);
        return ResponseEntity.ok(post);
    }

    @Operation(summary = "Create a quote of a post")
    @PostMapping("/{id}/quote")
    public ResponseEntity<Post> quotePost(@PathVariable UUID id, String content) {
        LOGGER.info("REST request to quote post");
        Post toQuote = postService.findPostById(id);
        Post post = new Post();
        post.setType(PostType.QUOTE);
        post.setUserId(getSimulatedAutheticatedUser().getId());
        post.setRepost(toQuote);
        post.setContent(content);
        toQuote.setQuoteCount(toQuote.getQuoteCount() + 1);
        postService.createPost(post);
        postService.updatePost(toQuote);
        return ResponseEntity.ok(post);
    }

    /**
     * This method is to get the user who created the post, repost or quote.
     * TODO: remove when the authentication is implemented
     */
    private User getSimulatedAutheticatedUser() {
        return userFeignClient.findRandomUser().getBody();
    }

}
