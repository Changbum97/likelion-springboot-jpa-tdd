package com.jpa.exercies.book_exercise.repository;

import com.jpa.exercies.book_exercise.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
