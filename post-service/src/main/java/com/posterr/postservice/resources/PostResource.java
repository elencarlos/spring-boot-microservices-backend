package com.posterr.postservice.resources;

import com.posterr.postservice.feignclients.UserFeignClient;
import com.posterr.postservice.models.Post;
import com.posterr.postservice.models.User;
import com.posterr.postservice.models.enums.PostType;
import com.posterr.postservice.service.PostService;
import com.posterr.postservice.service.criteria.PostCriteria;
import com.posterr.postservice.service.dto.PostCreationDTO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.HashSet;
import java.util.UUID;
import java.util.stream.Collectors;


/**
 * This is a REST controller for the Post resource.
 * <p>For the porpose of this test we don't implemented auth, so to make the post have a user
 * we just set the user id to a random getted by a feign client request into user-service.</p>
 * </p>
 */

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
    public ResponseEntity<Page<Post>> findAll(
            PostCriteria criteria,
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
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Post.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Post not found",
                    content = @Content)})
    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable UUID id) {
        LOGGER.info("REST request to find post by id");
        Post post = postService.findPostById(id);
        return ResponseEntity.ok(post);
    }

    @Operation(summary = "Create a post")
    @PostMapping
    public ResponseEntity<Post> create(@Valid @RequestBody PostCreationDTO post) {
        LOGGER.info("REST request to create post");
        //get a simulated user to create the repost
        //TODO: remove this line when auth is implemented the user will be getted from spring security auditor
        if (post.getUserId() == null) {
            User user = getSimulatedAutheticatedUser();
            post.setUserId(user.getId());
        }

        //verify if user can create a post
        if (!postService.userCanPost(post.getUserId())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        Post createdPost = new Post();
        createdPost.setType(PostType.ORIGINAL);
        createdPost.setUserId(post.getUserId());
        createdPost.setContent(post.getContent());
        return ResponseEntity.status(HttpStatus.CREATED).body(postService.createPost(createdPost));
    }

    @Operation(summary = "Create a repost")
    @PostMapping("/{id}/repost")
    public ResponseEntity<Post> repost(@PathVariable UUID id, @RequestParam(required = false) UUID userId) {
        LOGGER.info("REST request to repost post");
        //get a simulated user to create the repost
        //TODO: remove this line when auth is implemented the user will be getted
        //from spring security auditor
        if (userId == null) {
            User user = getSimulatedAutheticatedUser();
            userId = user.getId();
        }

        Post toRepost = postService.findPostById(id);

        //verify if user can create a repost
        if (!postService.userCanPost(userId)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        Post post = new Post();
        post.setType(PostType.REPOST);
        post.setRepost(toRepost);
        post.setUserId(userId);
        toRepost.setRepostCount(toRepost.getRepostCount() + 1);
        postService.createPost(post);
        postService.updatePost(toRepost);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }

    @Operation(summary = "Create a quote of a post")
    @PostMapping("/{id}/quote")
    public ResponseEntity<Post> quotePost(@PathVariable UUID id, @RequestParam String content, @RequestParam(required = false) UUID userId) {
        LOGGER.info("REST request to quote post");

        if (userId == null) {
            User user = getSimulatedAutheticatedUser();
            userId = user.getId();
        }

        if (!postService.userCanPost(userId)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        Post toQuote = postService.findPostById(id);
        Post post = new Post();
        post.setType(PostType.QUOTE);
        post.setUserId(userId);
        post.setQuotedPost(toQuote);
        post.setContent(content);
        toQuote.setQuoteCount(toQuote.getQuoteCount() + 1);
        postService.createPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }

    /**
     * This method is to get the user who created the post, repost or quote.
     * TODO: remove when the authentication is implemented
     */
    private User getSimulatedAutheticatedUser() {
        return userFeignClient.findRandomUser().getBody();
    }

}
