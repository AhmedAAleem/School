package com.School.repo;

import com.School.entities.Empolyee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpolyeeRepo extends JpaRepository <Empolyee, Long > {

//    public Empolyee findEmpolyeeByGrade (int grade);

}
