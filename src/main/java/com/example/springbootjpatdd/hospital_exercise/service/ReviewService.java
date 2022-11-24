package com.example.springbootjpatdd.hospital_exercise.service;

import com.example.springbootjpatdd.hospital_exercise.domain.dto.ReviewRequestDto;
import com.example.springbootjpatdd.hospital_exercise.domain.entity.Hospital;
import com.example.springbootjpatdd.hospital_exercise.domain.entity.Review;
import com.example.springbootjpatdd.hospital_exercise.repository.HospitalRepository;
import com.example.springbootjpatdd.hospital_exercise.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final HospitalRepository hospitalRepository;

    public Long add(ReviewRequestDto requestDto, Long hospitalId) {
        Hospital hospital = hospitalRepository.findById(hospitalId).get();
        Review savedReview = reviewRepository.save(requestDto.toEntity(hospital));
        return savedReview.getId();
    }
}
