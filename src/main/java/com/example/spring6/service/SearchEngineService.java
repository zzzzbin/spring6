package com.example.spring6.service;

import java.util.List;

import com.example.spring6.model.Document;
import com.example.spring6.model.DocumentType;

public class SearchEngineService implements SearchEngine{
    private DocumentDAO dao;

    public SearchEngineService(DocumentDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Document> findByType(DocumentType documentType) {
        return dao.findByType(documentType);
    }

    @Override
    public List<Document> listAll() {
        return dao.listAll();
    }
}
