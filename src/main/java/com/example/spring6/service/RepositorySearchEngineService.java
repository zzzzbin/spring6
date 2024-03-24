package com.example.spring6.service;

import java.util.ArrayList;
import java.util.List;

import com.example.spring6.model.Document;
import com.example.spring6.model.DocumentType;
import com.example.spring6.repository.DocumentRepository;

public class RepositorySearchEngineService implements SearchEngine {
    private DocumentRepository documentRepository;

    public RepositorySearchEngineService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public List<Document> findByType(DocumentType documentType) {
        return documentRepository.findByType(documentType);
    }

    @Override
    public List<Document> listAll() {
        var documents = new ArrayList<Document>();
        documentRepository.findAll().forEach(documents::add);
        return documents;
    }
}
