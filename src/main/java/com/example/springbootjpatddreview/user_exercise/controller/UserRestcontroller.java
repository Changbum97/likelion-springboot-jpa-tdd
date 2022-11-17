package com.example.springbootjpatddreview.user_exercise.controller;

import com.example.springbootjpatddreview.user_exercise.domain.dto.UserFindResponse;
import com.example.springbootjpatddreview.user_exercise.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public class UserRestcontroller {

    private final UserService userService;

    public UserRestcontroller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserFindResponse> getUser(@PathVariable Long id) {
        log.info("id : {}", id);
        UserFindResponse response = userService.findSingleUser(id);
        log.info("response : {}", response);
        return ResponseEntity.ok().body(response);
    }
}
