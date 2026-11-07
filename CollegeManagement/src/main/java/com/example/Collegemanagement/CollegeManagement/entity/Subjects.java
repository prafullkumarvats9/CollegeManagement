package com.example.Collegemanagement.CollegeManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@ToString
@Getter
@Setter
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectcode;

    private String name;

    @OneToMany(mappedBy = "subjects", cascade = CascadeType.ALL)
    private Set<Student> students = new HashSet<>();

    @OneToMany(mappedBy = "subjects", cascade = CascadeType.ALL)
    private Set<Professor> professor = new HashSet<>();
}
