package com.example.springbootjpatdd.hospital_exercise.repository;

import com.example.springbootjpatdd.hospital_exercise.domain.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
