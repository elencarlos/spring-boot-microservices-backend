package com.posterr.postservice.service.dto;

import com.posterr.postservice.models.Post;
import com.posterr.postservice.models.User;
import com.posterr.postservice.models.enums.PostType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class PostCreationDTO {
    @Size(max = 777, message = "Posts can have a maximum of 777 characters")
    private String content;
    private User user;
}