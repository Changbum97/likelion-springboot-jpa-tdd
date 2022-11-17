package com.example.springbootjpatddreview.user_exercise.repository;

import com.example.springbootjpatddreview.user_exercise.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
