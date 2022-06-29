package com.posterr.postservice.service.mapper;

import com.posterr.postservice.models.Post;
import com.posterr.postservice.service.dto.PostDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PostMapper {
    final ModelMapper modelMapper;

    public PostMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PostDTO toDto(Post s) {
        return modelMapper.map(s, PostDTO.class);
    }

    public Post toEntity(PostDTO postDTO) {
        return modelMapper.map(postDTO, Post.class);
    }
}
