package com.example.spring6.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Document {
    private Integer id;
    private String name;
    private String location;
    private DocumentType type;

    public Document(String name, DocumentType type, String location) {
        this.name = name;
        this.type = type;
        this.location = location;
    }
}
