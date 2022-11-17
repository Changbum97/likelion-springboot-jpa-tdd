package com.example.springbootjpatddreview.user_exercise.controller;

import com.example.springbootjpatddreview.user_exercise.domain.dto.UserAddRequest;
import com.example.springbootjpatddreview.user_exercise.domain.dto.UserResponse;
import com.example.springbootjpatddreview.user_exercise.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserRestcontroller.class)
class UserRestcontrollerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserService userService;

    @Test
    @DisplayName("GET Single User Test")
    void getUserTest() throws Exception {

        UserResponse expectedResponse = UserResponse.builder()
                .id(1L).username("User").build();

        given(userService.findSingleUser(1L)).willReturn(expectedResponse);

        mockMvc.perform(get("/api/v1/users/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.username").value("User"))
                .andExpect(jsonPath("$.message").isEmpty())
                .andDo(print());

        verify(userService).findSingleUser(1L);
    }

    @Test
    @DisplayName("GET Wrong Single User Test")
    void getWrongUserTest() throws Exception {
        UserResponse expectedResponse = UserResponse.builder()
                .message("해당 id의 user가 없습니다").build();

        given(userService.findSingleUser(100L)).willReturn(expectedResponse);

        mockMvc.perform(get("/api/v1/users/100"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").isEmpty())
                .andExpect(jsonPath("$.username").isEmpty())
                .andExpect(jsonPath("$.message").value("해당 id의 user가 없습니다"))
                .andDo(print());

        verify(userService).findSingleUser(100L);
    }
}