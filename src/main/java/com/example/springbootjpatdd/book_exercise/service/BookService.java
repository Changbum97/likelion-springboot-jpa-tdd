package com.example.springbootjpatdd.book_exercise.service;

import com.example.springbootjpatdd.book_exercise.domain.dto.BookResponseDto;
import com.example.springbootjpatdd.book_exercise.domain.entity.Book;
import com.example.springbootjpatdd.book_exercise.repository.BookRepository;
import lombok.RequiredArgsConstructor;
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
            dtoList.add(BookResponseDto.of(book));
        }

        return dtoList;
    }
}
