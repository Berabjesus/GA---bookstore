package com.example.jasp.repository;

import com.example.jasp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * //TODO :- comments
 * 1. repository
 * 2. trasnactional
 * 3. Jparepo
 */
@Transactional
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
