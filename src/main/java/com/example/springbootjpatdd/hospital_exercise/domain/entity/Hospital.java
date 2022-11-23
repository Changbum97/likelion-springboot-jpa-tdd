package com.example.springbootjpatdd.hospital_exercise.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Hospital {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hospitalName;
    private String roadNameAddress;

    @OneToMany(mappedBy = "hospital")
    private List<Review> reviews;
}
