package com.School.controller;

import com.School.entities.Student;
import com.School.services.StudentServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentServices studentServices;


    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student newStudent = studentServices.insertStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student newStudent = studentServices.updateStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public Optional<Student> findStudentById(@PathVariable("id") Long id) {
        Optional<Student> student = studentServices.getStudentById(id);
        return student;
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Student> deleteStudents() {
        studentServices.deleteallstudent();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping ("/findg/{grade}")
    public Optional <Student> getStudentsByGrade (@PathVariable("grade") int grade){
        Optional<Student> student = studentServices.getStudentByGarde(grade);
        return student;
    }
}

