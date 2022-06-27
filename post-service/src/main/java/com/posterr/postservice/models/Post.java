package com.posterr.postservice.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Column(name = "content", nullable = false, length = 777)
    @Size(min = 1, max = 777, message = "Posts can have a maximum of 777 characters")
    private String content;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @Column(name = "like_count", nullable = true)
    private Integer likes = 0;

    @Column(name = "repost_count", nullable = true)
    private Integer reposts = 0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repost_id", insertable = false, updatable = false)
    private Post repost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quoted_post_id", insertable = false, updatable = false)
    private Post quotedPostId;

    public Post() {
    }

    public Post(UUID id, String content, LocalDateTime createdAt, LocalDateTime updatedAt, UUID userId) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.userId = userId;
    }

}