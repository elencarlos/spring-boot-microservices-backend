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

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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

    public Boolean userCanPost(UUID userId) {
        return postRepository.userCanPost(userId);
    }

    private Specification<Post> createSpecification(PostCriteria criteria) {

        Specification<Post> specification = Specification.where(null);
        if (criteria != null) {
            if (criteria.getUserId() != null) {
                specification = specification.and((Specification<Post>) (root, query, cb) -> cb.equal(root.get("userId"), criteria.getUserId()));
            }
            if (criteria.getCreatedAtGreaterThan() != null) {
                specification = specification.and((Specification<Post>) (root, query, cb) -> cb.greaterThan(
                        root.get("createdAt"),
                        criteria.getCreatedAtGreaterThan().atStartOfDay()
                ));
            }
            if (criteria.getCreatedAtLessThan() != null) {
                specification = specification.and((Specification<Post>) (root, query, cb) -> cb.lessThan(
                        root.get("createdAt"),
                        criteria.getCreatedAtLessThan().atStartOfDay()
                ));
            }
        }
        return specification;
    }
}
