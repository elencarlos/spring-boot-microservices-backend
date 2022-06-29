package com.posterr.postservice.service;

import com.posterr.postservice.feignclients.UserFeignClient;
import com.posterr.postservice.models.Post;
import com.posterr.postservice.repository.PostRepository;
import com.posterr.postservice.service.criteria.PostCriteria;
import com.posterr.postservice.service.mapper.PostMapper;
import org.hibernate.FetchNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PostService {
    final PostRepository postRepository;

    final PostMapper postMapper;

    final UserFeignClient userFeignClient;

    public PostService(PostRepository postRepository, PostMapper postMapper, UserFeignClient userFeignClient) {
        this.postRepository = postRepository;
        this.postMapper = postMapper;
        this.userFeignClient = userFeignClient;
    }

    public Post findPostById(UUID id) {
        return postRepository.findById(id).orElseThrow(() -> new FetchNotFoundException("Post not found", id));
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public Post updatePost(Post post) {
        return postRepository.save(post);
    }

    public void deletePost(UUID id) {
        postRepository.deleteById(id);
    }

    public Page<Post> findAllPosts(PostCriteria criteria, Pageable pageable) {
        final Specification<Post> specification = createSpecification(criteria);
        return postRepository.findAll(specification, pageable);
    }

    public Iterable<Post> findAllPostsByUserId(UUID userId, Pageable pageable) {
        return postRepository.findAllByUserId(userId, pageable);
    }

    private Specification<Post> createSpecification(PostCriteria criteria) {
        Specification<Post> specification = Specification.where(null);
        if (criteria != null) {
        }
        return specification;
    }
}
