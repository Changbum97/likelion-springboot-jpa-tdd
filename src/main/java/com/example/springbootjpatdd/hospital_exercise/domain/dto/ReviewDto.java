package com.example.springbootjpatdd.hospital_exercise.domain.dto;

import com.example.springbootjpatdd.hospital_exercise.domain.entity.Hospital;
import com.example.springbootjpatdd.hospital_exercise.domain.entity.Review;
import lombok.Builder;
import lombok.Getter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class ReviewDto {

    private Long id;
    private String title;
    private String content;
    private String patientName;

    public static List<ReviewDto> of(List<Review> reviews) {
        List<ReviewDto> reviewDtoList = new ArrayList<>();
        for(Review review : reviews) {
            reviewDtoList.add(
                ReviewDto.builder()
                        .id(review.getId())
                        .title(review.getTitle())
                        .content(review.getContent())
                        .patientName(review.getPatientName())
                        .build()
            );
        }

        return reviewDtoList;
    }
}
