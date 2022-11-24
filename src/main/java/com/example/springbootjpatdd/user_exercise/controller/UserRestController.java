package com.example.springbootjpatdd.user_exercise.controller;

import com.example.springbootjpatdd.user_exercise.domain.dto.UserAddRequest;
import com.example.springbootjpatdd.user_exercise.domain.dto.UserResponse;
import com.example.springbootjpatdd.user_exercise.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable Long id) {
        UserResponse response = userService.findSingleUser(id);
        log.info("response : {}", response);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("")
    public ResponseEntity<UserResponse> addUser(@RequestBody UserAddRequest request) {
        log.info("request : {}", request);
        return ResponseEntity.ok().body(userService.addUser(request));
    }
}
