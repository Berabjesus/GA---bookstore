package com.example.jasp.service.interfaces;

import com.example.jasp.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookService {
    public List<Book> getAllBooks();

    @Query("Select b from Book b where b.author.id= :id")
    public List<Book> getAllBooksByAuthorID(@Param("id") Long id);
    public Book getBookById(Long id);
    public Book addBook(Book book);
}
