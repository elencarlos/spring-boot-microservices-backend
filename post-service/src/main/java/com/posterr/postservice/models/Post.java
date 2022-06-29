package com.posterr.postservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.posterr.postservice.models.enums.PostType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tb_post")
@EntityListeners(AuditingEntityListener.class)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private PostType type;

    @Column(name = "content", length = 777)
    @Size(max = 777, message = "Posts can have a maximum of 777 characters")
    private String content;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @Column(name = "quote_count", columnDefinition = "int default 0")
    private Integer quoteCount = 0;

    @Column(name = "repost_count", columnDefinition = "int default 0")
    private Integer repostCount = 0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repost_id", insertable = false, updatable = false)
    private Post repost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quoted_post_id", insertable = false, updatable = false)
    private Post quotedPost;

    @JsonIgnore
    @Transient
    User user;

}