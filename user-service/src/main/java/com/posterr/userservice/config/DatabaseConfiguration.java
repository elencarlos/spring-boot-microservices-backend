package com.posterr.userservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("com.posterr.userservice.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {}
