package com.example.spring6.service;

import java.util.List;

import com.example.spring6.model.Document;
import com.example.spring6.model.DocumentType;

public interface SearchEngine {
    List<Document> findByType(DocumentType documentType);
    List<Document> listAll();
}
