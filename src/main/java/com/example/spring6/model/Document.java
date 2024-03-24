package com.example.spring6.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Document {
    private final String name;
    private final DocumentType type;
    private final String location;
    private final LocalDate created;
    private LocalDate modified;

    public Document(String name, DocumentType type, String location) {
        this.name = name;
        this.type = type;
        this.location = location;
        created = LocalDate.now();
        modified = LocalDate.now();
    }
}
