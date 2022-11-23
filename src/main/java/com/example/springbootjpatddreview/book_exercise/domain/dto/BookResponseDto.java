package com.jpa.exercies.book_exercise.domain.dto;

import com.jpa.exercies.book_exercise.domain.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class BookResponseDto {
    private Long book_id;
    private String book_name;
    private String author_name;

    public static BookResponseDto of(Book book) {
        return BookResponseDto.builder()
                .book_id(book.getId())
                .book_name(book.getName())
                .author_name(book.getAuthor().getName())
                .build();
    }
}
