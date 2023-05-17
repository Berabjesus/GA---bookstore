package com.example.jasp.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * //TODO :- comments
 * 1. Why persist
 * 2. orphanRemoval
 * 3. Genvalue
 * 4. @size
 */
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotEmpty(message = "Name may not be empty")
    @Size(max = 32, message = "Name must be less than 50 characters long")
    private String name;

    @Size(max = 50)
    private String nationality;

    private Integer age;

    @OneToMany(mappedBy = "author", cascade = CascadeType.PERSIST)
    private List<Book> books;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, String nationality, Integer age, List<Book> books) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
