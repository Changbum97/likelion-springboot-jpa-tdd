package com.example.springbootjpatddreview.user_exercise.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class UserFindResponse {
    private Long id;
    private String username;
    private String message;
}
