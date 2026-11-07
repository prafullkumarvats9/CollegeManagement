package com.example.Collegemanagement.CollegeManagement.repository;

import com.example.Collegemanagement.CollegeManagement.dto.CStudentInfo;
import com.example.Collegemanagement.CollegeManagement.dto.StudentInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {

    @Query("select s.id as id, s.name as name, s.branch as branch from Student s")
    List<StudentInfo> getAllStudentsInfo();

    @Query("select new com.example.Collegemanagement.CollegeManagement.dto.CStudentInfo(s.id, s.name, s.branch)" + "from Student s")
    List<CStudentInfo> getAllStudentsInfoConcerete();


    List<CStudentInfo> getAllStudentsInfoWithSubjects();

}
