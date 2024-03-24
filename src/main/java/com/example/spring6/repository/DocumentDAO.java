package com.example.spring6.repository;

import java.util.List;

import com.example.spring6.model.Document;
import com.example.spring6.model.DocumentType;

public interface DocumentDAO {
    List<Document> findByType(DocumentType documentType);
    List<Document> listAll();
}
