package com.example.spring6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    @ResponseBody
    public String getMessage(){
        return "Hello world!";
    }
}
