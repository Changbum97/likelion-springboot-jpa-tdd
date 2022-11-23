package com.example.springbootjpatdd.hospital_exercise.service;

import com.example.springbootjpatdd.hospital_exercise.domain.dto.HospitalResponseDto;
import com.example.springbootjpatdd.hospital_exercise.domain.entity.Hospital;
import com.example.springbootjpatdd.hospital_exercise.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HospitalService {

    private final HospitalRepository hospitalRepository;

    public List<HospitalResponseDto> findAll() {
        List<Hospital> hospitals = hospitalRepository.findAll();
        List<HospitalResponseDto> dtoList = new ArrayList<>();

        for(Hospital hospital : hospitals) {
            dtoList.add(HospitalResponseDto.of(hospital));
        }

        return dtoList;
    }
}
