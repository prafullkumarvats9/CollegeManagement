package com.example.Collegemanagement.CollegeManagement.repository;

import com.example.Collegemanagement.CollegeManagement.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}