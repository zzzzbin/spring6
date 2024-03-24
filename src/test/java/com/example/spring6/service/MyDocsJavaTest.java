package com.example.spring6.service;

public class MyDocsJavaTest implements MyDocsBaseTest {
    SearchEngine searchEngine = new StaticSearchEngine();
    @Override
    public SearchEngine getEngine() {
        return searchEngine;
    }
}
