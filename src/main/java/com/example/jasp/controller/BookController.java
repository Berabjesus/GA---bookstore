package com.example.jasp.controller;

import com.example.jasp.model.Book;
import com.example.jasp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * //TODO :- comments
 * 1. service
 * 2. trasnactional/ why also at service level
 * 3. Autowired
 */
@RestController
@RequestMapping(path = "/api/users")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    public ResponseEntity<?> getAllUsers() {
        List<Book> books = bookService.getAllBooks();

        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
