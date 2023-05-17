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
}
