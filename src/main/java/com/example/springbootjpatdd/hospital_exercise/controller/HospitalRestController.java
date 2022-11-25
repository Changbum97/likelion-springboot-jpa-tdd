package com.example.springbootjpatdd.hospital_exercise.controller;

import com.example.springbootjpatdd.hospital_exercise.domain.dto.HospitalResponseDto;
import com.example.springbootjpatdd.hospital_exercise.service.HospitalService;
import com.example.springbootjpatdd.hospital_exercise.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hospitals")
@RequiredArgsConstructor
public class HospitalRestController {

    private final HospitalService hospitalService;
    private final ReviewService reviewService;

    @GetMapping("/list")
    public ResponseEntity<List<HospitalResponseDto>> getHospitalList() {
        return ResponseEntity.ok().body(hospitalService.findAll());
    }

    @GetMapping("/{hospitalId}")
    public ResponseEntity<HospitalResponseDto> getHospital(@PathVariable Long hospitalId) {
        return ResponseEntity.ok().body(hospitalService.findOne(hospitalId));
    }


}
