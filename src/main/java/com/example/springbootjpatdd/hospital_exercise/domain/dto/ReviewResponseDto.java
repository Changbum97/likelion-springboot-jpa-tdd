package com.example.springbootjpatdd.hospital_exercise.domain.dto;

import com.example.springbootjpatdd.hospital_exercise.domain.entity.Review;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ReviewResponseDto {

    private Long reviewId;
    private String title;
    private String content;
    private String patientName;
    private String hospitalName;

    public static ReviewResponseDto fromEntity(Review review) {
        return ReviewResponseDto.builder()
                .reviewId(review.getId())
                .title(review.getTitle())
                .content(review.getContent())
                .patientName(review.getPatientName())
                .hospitalName(review.getHospital().getHospitalName())
                .build();
    }
}
