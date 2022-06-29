package com.posterr.postservice.service.dto;

import com.posterr.postservice.models.Post;
import com.posterr.postservice.models.PostType;
import com.posterr.postservice.models.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class PostDTO {
    private UUID id;

    private PostType type;

    private String content;

    private Integer likes;

    private Integer reposts;

    private Post repost;

    private Post quotedPost;

}