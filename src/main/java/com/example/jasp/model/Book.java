package com.example.jasp.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * //TODO :- comments
 * 1. Why persist
 * 2. orphanRemoval
 * 3. Genvalue
 * 4. @size
 * 5.JoinColumn
 * 6. Required args constructors
 */
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotEmpty(message = "title may not be empty")
    @Size(max = 50, message = "title must be less than 50 characters long")
    private String title;
    private String description;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    public Book(String title, String description, Author author, Publisher publisher, Genre genre) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }

    public Book(String title, Author author, Publisher publisher, Genre genre) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
