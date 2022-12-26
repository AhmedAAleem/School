package com.School.repo;

import com.School.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student , Long> {

    public Student findById (long id);
//
//    public Student findByGrade ( int grade );





}
