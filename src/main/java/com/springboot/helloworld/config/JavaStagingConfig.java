package com.springboot.helloworld.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("staging")
@Configuration
public class JavaStagingConfig {
    @PostConstruct
    public void devTest() {
        System.out.println("Loading Staging Environment...");
    }
}
