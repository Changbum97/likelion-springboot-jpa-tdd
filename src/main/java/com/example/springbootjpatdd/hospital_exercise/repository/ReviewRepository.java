package com.example.springbootjpatdd.hospital_exercise.repository;

import com.example.springbootjpatdd.hospital_exercise.domain.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
