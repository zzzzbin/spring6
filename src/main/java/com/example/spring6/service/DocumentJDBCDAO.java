package com.example.spring6.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.spring6.model.Document;
import com.example.spring6.model.DocumentType;

public class DocumentJDBCDAO implements DocumentDAO {
    private JdbcTemplate template;

    public DocumentJDBCDAO(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Document> findByType(DocumentType documentType) {
        return template.query("select * from document d where d.type=?", p -> p.setString(1, documentType.name()), new DocumentMapper());
    }

    @Override
    public List<Document> listAll() {
        return template.query("select * from document", new DocumentMapper());
    }
}
