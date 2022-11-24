package com.example.springbootjpatdd.hospital_exercise.domain.dto;

import com.example.springbootjpatdd.hospital_exercise.domain.entity.Hospital;
import com.example.springbootjpatdd.hospital_exercise.domain.entity.Review;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ReviewRequestDto {

    private String title;
    private String content;
    private String patientName;

    public Review toEntity(Hospital hospital) {
        return Review.builder()
                .title(this.title)
                .content(this.content)
                .patientName(this.patientName)
                .hospital(hospital)
                .build();
    }
}
