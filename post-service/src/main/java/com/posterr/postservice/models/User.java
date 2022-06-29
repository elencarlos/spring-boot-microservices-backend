package com.posterr.postservice.models;

import lombok.Data;

import java.util.UUID;

@Data
public class User {
    private UUID id;
    private String name;
    private String email;
    private String username;

}