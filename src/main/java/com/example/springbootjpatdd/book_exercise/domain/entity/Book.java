package com.example.springbootjpatdd.book_exercise.domain.entity;

import com.example.springbootjpatdd.book_exercise.domain.dto.BookResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Author author;

    public BookResponseDto toDto() {
        return new BookResponseDto(this.id, this.name, this.getAuthor().getName());
    }
}
