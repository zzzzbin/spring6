package com.example.spring6.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.spring6.model.Document;
import com.example.spring6.model.DocumentType;

import static com.example.spring6.model.DocumentType.DOC;
import static com.example.spring6.model.DocumentType.DOCX;
import static com.example.spring6.model.DocumentType.PDF;
import static com.example.spring6.model.DocumentType.URL;

public class StaticSearchEngine implements SearchEngine {
    private final List<Document> data = populate();

    private List<Document> populate() {
        return List.of(new Document(
                        "Book Template.pdf", PDF, "/Docs/Template.pdf"
                ),
                new Document(
                        "Apress Home Page", URL, "https://apress.com/"
                ),
                new Document(
                        "Chapter Template.doc", DOC, "/Docs/Chapter Sample.doc"
                ),
                new Document(
                        "Chapter 01.docx", DOCX, "/Docs/Chapter 01.docx"
                ));
    }

    @Override
    public List<Document> findByType(DocumentType documentType) {
        return data.stream().filter(e->e.getType().equals(documentType)).collect(Collectors.toList());
    }

    @Override
    public List<Document> listAll() {
        return data;
    }
}
