package com.example.springbootjpatdd.hospital_exercise.controller;

import com.example.springbootjpatdd.hospital_exercise.domain.dto.ReviewRequestDto;
import com.example.springbootjpatdd.hospital_exercise.domain.dto.ReviewResponseDto;
import com.example.springbootjpatdd.hospital_exercise.domain.entity.Review;
import com.example.springbootjpatdd.hospital_exercise.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/reviews")
@RequiredArgsConstructor
public class ReviewRestController {

    private final ReviewService reviewService;

    @PostMapping("/{hospitalId}")
    public String addReviews(@PathVariable Long hospitalId, @RequestBody ReviewRequestDto requestDto) {
        Long savedReviewId = reviewService.add(requestDto, hospitalId);
        return savedReviewId + "번 리뷰 등록 완료";
    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<ReviewResponseDto> getReview(@PathVariable Long reviewId) {
        Review review = reviewService.findOne(reviewId);
        return ResponseEntity.ok().body(ReviewResponseDto.fromEntity(review));
    }
}
