package com.School.repo;

import com.School.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student , Long> {

    public Student findById (long id);
//
    public Optional<Student> findByGrade (int grade );





}
