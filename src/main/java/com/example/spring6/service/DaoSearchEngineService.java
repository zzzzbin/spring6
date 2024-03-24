package com.example.spring6.service;

import java.util.List;

import com.example.spring6.model.Document;
import com.example.spring6.model.DocumentType;
import com.example.spring6.repository.DocumentDAO;

public class DaoSearchEngineService implements SearchEngine{
    private DocumentDAO dao;

    public DaoSearchEngineService(DocumentDAO dao) {
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
