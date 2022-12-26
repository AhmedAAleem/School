package com.School.services;

import com.School.entities.Student;
import com.School.repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("StudentServices")
public class StudentServices {

    private StudentRepo studentRepo ;

    public StudentServices(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student insertStudent (Student student) {
        return studentRepo.save(student);
    }

    public  Student updateStudent ( Student student){
        return studentRepo.save(student);
    }
    public void  deleteallstudent ( ){
       studentRepo.deleteAll();
    }

    public Optional<Student> getStudentById (Long id){
        return studentRepo.findById(id);

    }

    public Optional<Student> getStudentByGarde ( int grade){
        return studentRepo.findByGrade(grade);
    }

}
