package com.example.springbootjpatddreview.user_exercise.domain.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UserAddRequest {
    private String username;
    private String password;
}
