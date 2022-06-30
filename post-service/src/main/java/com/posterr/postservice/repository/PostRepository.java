package com.posterr.postservice.repository;

import com.posterr.postservice.models.Post;
import com.posterr.postservice.models.User;
import org.hibernate.annotations.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PostRepository extends CrudRepository<Post, UUID>, JpaSpecificationExecutor<Post> {
    @Cacheable("postsByUserId")
    List<Post> findAllByUserId(UUID userId, Pageable pageable);

    @Cacheable("postById")
    Optional<Post> findById(UUID id);

    @Query("SELECT CASE WHEN count(p) < 5 THEN true ELSE false END as canPost FROM Post p WHERE p.user = ?1 and p.createdAt > CURRENT_DATE-1")
    Boolean userCanPost(User user);
}