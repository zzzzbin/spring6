package com.example.spring6.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.spring6.config.TestConfig;

import static com.example.spring6.model.DocumentType.PDF;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = TestConfig.class)
public class MyDocumentsSpringTest {
    @Autowired
    SearchEngine engine;

    @Test
    void findByType() {
        var documents = engine.findByType(PDF);
        assertNotNull(documents);
        assertEquals(documents.size(), 1);
        assertEquals(PDF.name, documents.get(0).getType().name);
        assertEquals(PDF.desc, documents.get(0).getType().desc);
        assertEquals(PDF.extension, documents.get(0).getType().extension);
    }
    @Test
    void listAll() {
        var documents = engine.listAll();
        assertNotNull(documents);
        assertEquals(documents.size(), 4);
    }
}
