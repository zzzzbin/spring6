package com.example.spring6.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.spring6.model.Document;
import com.example.spring6.model.DocumentType;

public class DocumentMapper implements RowMapper<Document> {

    @Override
    public Document mapRow(ResultSet rs, int rowNum) throws SQLException {
        Document document=new Document();
        document.setId(rs.getInt("id"));
        document.setLocation(rs.getString("location"));
        document.setType(DocumentType.valueOf(rs.getString("type"))); document.setName(rs.getString("name"));
        return document;
    }
}
