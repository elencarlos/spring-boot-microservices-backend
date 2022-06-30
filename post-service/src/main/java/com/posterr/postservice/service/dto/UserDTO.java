package com.posterr.postservice.service.dto;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;
@Data
public class UserDTO {
    private UUID id;
    private String name;
    private String username;
    private LocalDateTime createdAt;
}