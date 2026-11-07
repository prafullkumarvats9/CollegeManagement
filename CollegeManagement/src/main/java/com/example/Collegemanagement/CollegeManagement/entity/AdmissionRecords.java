package com.example.Collegemanagement.CollegeManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class AdmissionRecords {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer fees;

    @OneToMany(mappedBy = "admissionrecords", cascade = CascadeType.ALL)
    private Set<Student> student = new HashSet<>();
}
