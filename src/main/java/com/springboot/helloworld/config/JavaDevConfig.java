package com.springboot.helloworld.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class JavaDevConfig {
    @PostConstruct
    public void devTest() {
        System.out.println("Loading Dev Environment...");
    }
}
