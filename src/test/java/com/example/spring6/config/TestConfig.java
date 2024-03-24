package com.example.spring6.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.spring6.repository.DocumentRepository;
import com.example.spring6.service.RepositorySearchEngineService;
import com.example.spring6.service.SearchEngine;

@TestConfiguration
@EnableJpaRepositories
public class TestConfig {
    @Bean
    SearchEngine searchEngine(DocumentRepository repository){
        return new RepositorySearchEngineService(repository);
    }
}
