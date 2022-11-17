package com.example.springbootjpatddreview.user_exercise.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class UserAddRequest {
    private String username;
    private String password;
}
