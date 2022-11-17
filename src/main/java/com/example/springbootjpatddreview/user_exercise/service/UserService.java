package com.example.springbootjpatddreview.user_exercise.service;

import com.example.springbootjpatddreview.user_exercise.domain.dto.UserFindResponse;
import com.example.springbootjpatddreview.user_exercise.domain.entity.User;
import com.example.springbootjpatddreview.user_exercise.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserFindResponse findSingleUser(Long id) {
        Optional<User> optUser = userRepository.findById(id);
        if(optUser.isEmpty()) {
            return UserFindResponse.builder()
                    .message("해당 id의 user가 없습니다")
                    .build();
        }

        User findUser = optUser.get();

        // User -> UserFindResponse로 변환해서 return
        return UserFindResponse.builder()
                .id(findUser.getId())
                .username(findUser.getUsername())
                .build();
    }
}
