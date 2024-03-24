package com.example.spring6.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring6.model.Document;
import com.example.spring6.model.DocumentType;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Integer> {
    List<Document> findByType(DocumentType documentType);
}
