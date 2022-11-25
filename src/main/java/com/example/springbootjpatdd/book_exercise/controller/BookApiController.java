package com.example.springbootjpatdd.book_exercise.controller;

import com.example.springbootjpatdd.book_exercise.domain.dto.BookResponseDto;
import com.example.springbootjpatdd.book_exercise.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookApiController {

    private final BookService bookService;

    @GetMapping("/list")
    public ResponseEntity<List<BookResponseDto>> getBookList() {
        List<BookResponseDto> responseDtoList = bookService.findAll();
        return ResponseEntity.ok().body(responseDtoList);
    }
}
