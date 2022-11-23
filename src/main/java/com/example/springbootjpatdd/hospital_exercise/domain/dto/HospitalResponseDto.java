package com.example.springbootjpatdd.hospital_exercise.domain.dto;

import com.example.springbootjpatdd.hospital_exercise.domain.entity.Hospital;
import com.example.springbootjpatdd.hospital_exercise.domain.entity.Review;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class HospitalResponseDto {

    private Long id;
    private String hospitalName;
    private String roadNameAddress;
    private List<Review> reviews;

    public static HospitalResponseDto of(Hospital hospital) {
        return HospitalResponseDto.builder()
                .id(hospital.getId())
                .hospitalName(hospital.getHospitalName())
                .roadNameAddress(hospital.getRoadNameAddress())
                .reviews(hospital.getReviews())
                .build();
    }
}
