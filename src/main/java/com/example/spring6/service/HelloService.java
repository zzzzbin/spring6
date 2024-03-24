package com.example.spring6.service;

public class HelloService implements MessageService{
    @Override
    public String getMessage() {
        return "Hello world";
    }
}
