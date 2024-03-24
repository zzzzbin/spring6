package com.example.spring6.service;

import org.junit.jupiter.api.Test;

import static com.example.spring6.model.DocumentType.PDF;
import static org.junit.jupiter.api.Assertions.*;

class SearchEngineTest {
    SearchEngine engin = new StaticSearchEngine();
    @Test
    void findByType() {
        var documents = engin.findByType(PDF);
        assertNotNull(documents);
        assertEquals(documents.size(), 1);
        assertEquals(PDF.name, documents.get(0).getType().name);
        assertEquals(PDF.desc, documents.get(0).getType().desc);
        assertEquals(PDF.extension, documents.get(0).getType().extension);
    }

    @Test
    void listAll() {
        var documents = engin.listAll();
        assertNotNull(documents);
        assertEquals(documents.size(), 4);
    }
}