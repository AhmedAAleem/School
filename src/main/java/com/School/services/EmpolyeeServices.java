package com.School.services;

import com.School.entities.Empolyee;
import com.School.repo.EmpolyeeRepo;
import org.springframework.stereotype.Service;

@Service ("EmpolyeeServices")
public class EmpolyeeServices {

    private EmpolyeeRepo empolyeeRepo ;

    public Empolyee insterEmpolyee (Empolyee empolyee){
        return empolyeeRepo.save(empolyee);
    }

    public EmpolyeeServices(EmpolyeeRepo empolyeeRepo) {
        this.empolyeeRepo = empolyeeRepo;
    }

    public Empolyee updateEmpolyee (Empolyee empolyee){
        return empolyeeRepo.save(empolyee);

    }

    public void deleteAllEmpolyee (){
        empolyeeRepo.deleteAll();
    }

//    public Empolyee getAllEmpolyee (){
//        return empolyeeRepo.getAllEmpolyee();

    }


