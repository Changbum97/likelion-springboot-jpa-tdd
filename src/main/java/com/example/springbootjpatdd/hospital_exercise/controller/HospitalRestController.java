package com.example.springbootjpatdd.hospital_exercise.controller;

import com.example.springbootjpatdd.hospital_exercise.domain.dto.HospitalResponseDto;
import com.example.springbootjpatdd.hospital_exercise.service.HospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
@RequiredArgsConstructor
public class HospitalRestController {

    private final HospitalService hospitalService;

    @GetMapping("/list")
    public ResponseEntity<List<HospitalResponseDto>> getHospitalList() {
        return ResponseEntity.ok().body(hospitalService.findAll());
    }
}
