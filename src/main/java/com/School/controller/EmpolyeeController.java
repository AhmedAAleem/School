package com.School.controller;

import com.School.entities.Empolyee;
import com.School.services.EmpolyeeServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("empolyee")
public class EmpolyeeController {

    private final EmpolyeeServices empolyeeServices ;


    public EmpolyeeController(EmpolyeeServices empolyeeServices) {
        this.empolyeeServices = empolyeeServices;
    }

    @PostMapping ("/add")
    public ResponseEntity <Empolyee> addEmpolyee (@RequestBody Empolyee empolyee){
        Empolyee newEmpolyee = empolyeeServices.insterEmpolyee(empolyee);
        return new ResponseEntity<>(newEmpolyee, HttpStatus.CREATED);
    }

    @PutMapping ("/update")
    public ResponseEntity <Empolyee> updateEmpolyee (@RequestBody Empolyee empolyee){
        Empolyee updateEmpolyee = empolyeeServices.updateEmpolyee(empolyee);
        return new ResponseEntity<>(updateEmpolyee,HttpStatus.OK);
    }
//    @GetMapping ("/get")
//    public ResponseEntity<Empolyee> getEmpolyee (){
//        Empolyee empolyee = empolyeeServices.getAllEmpolyee();
//        return new ResponseEntity<>(empolyee, HttpStatus.OK);
//    }

    @DeleteMapping("/delete")
    public ResponseEntity<Empolyee> deleteAllEmpolyee (){
        empolyeeServices.deleteAllEmpolyee();
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
