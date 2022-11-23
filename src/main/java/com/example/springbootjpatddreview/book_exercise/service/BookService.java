package com.jpa.exercies.book_exercise.service;

import com.jpa.exercies.book_exercise.domain.dto.BookResponseDto;
import com.jpa.exercies.book_exercise.domain.entity.Book;
import com.jpa.exercies.book_exercise.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<BookResponseDto> findAll() {
        List<Book> books = bookRepository.findAll();
        List<BookResponseDto> dtoList = new ArrayList<>();

        for(Book book : books) {
            dtoList.add(book.toDto());
        }

        return dtoList;
    }
}
