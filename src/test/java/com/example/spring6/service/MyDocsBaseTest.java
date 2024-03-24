package com.example.spring6.service;

import org.junit.jupiter.api.Test;

import static com.example.spring6.model.DocumentType.PDF;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public interface MyDocsBaseTest {
    SearchEngine getEngine();
    @Test
    default void testEngineNonNull() {
        assertNotNull(getEngine());
    }
    @Test
    default void testFindByType() {
        var documents = getEngine().findByType(PDF);
        assertNotNull(documents);
        assertEquals(documents.size(), 1);
        assertEquals(PDF.name,
                documents.get(0).getType().name);
        assertEquals(PDF.desc,
                documents.get(0).getType().desc);
        assertEquals(PDF.extension,
                documents.get(0).getType().extension);
    }
    @Test
    default void testListAll() {
        var documents = getEngine().listAll();
        assertNotNull(documents);
        assertEquals(documents.size(), 4);
    }
}
