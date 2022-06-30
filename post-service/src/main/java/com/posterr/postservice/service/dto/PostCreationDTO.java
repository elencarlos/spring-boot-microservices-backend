package com.posterr.postservice.service.dto;

import com.posterr.postservice.models.Post;
import com.posterr.postservice.models.User;
import com.posterr.postservice.models.enums.PostType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class PostCreationDTO {
    private UUID userId;
    private String content;
}