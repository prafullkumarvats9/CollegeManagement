package com.example.Collegemanagement.CollegeManagement.repository;

import com.example.Collegemanagement.CollegeManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepository extends JpaRepository<Student, Long> {
}