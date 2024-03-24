package com.example.spring6.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.example.spring6.service.SearchEngine;
import com.example.spring6.service.StaticSearchEngine;

@TestConfiguration
public class TestConfig {
    @Bean
    SearchEngine searchEngine(){
        return new StaticSearchEngine();
    }
}
