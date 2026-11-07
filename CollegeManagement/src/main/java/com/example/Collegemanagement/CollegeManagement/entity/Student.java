package com.example.Collegemanagement.CollegeManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@ToString
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "birth_date")
    private LocalDate BirthDate;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private String Gender;

    private String branch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_code")
    private Subjects subjects;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admission_records")
    private AdmissionRecords admissionrecords;

}
