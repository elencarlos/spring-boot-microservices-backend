package com.posterr.postservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("com.posterr.postservice.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {}
