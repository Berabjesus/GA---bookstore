package com.example.jasp.service;

import com.example.jasp.model.Book;
import com.example.jasp.repository.BookRepository;
import com.example.jasp.service.interfaces.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


/**
 * //TODO :- comments
 * 1. service
 * 2. trasnactional/ why also at service level
 * 3. Autowired
 */
@Service
@Transactional
public class BookService implements IBookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
       return bookRepository.findAll();
    }

    @Override
    public List<Book> getAllBooksByAuthorID(Long id) {
        return null;
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
}
