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
 * 5.JoinColumn
 */
@Entity
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotEmpty(message = "name may not be empty")
    @Size(max = 50, message = "name must be less than 50 characters long")
    private String name;

    @NotEmpty(message = "location may not be empty")
    @Size(max = 50, message = "location must be less than 50 characters long")
    private String location;

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.PERSIST)
    private List<Book> books;
}
