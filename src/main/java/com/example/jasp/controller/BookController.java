package com.example.jasp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class BookController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello world";
    }
}
