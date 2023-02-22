package com.ironhack.week6day3.controller;


import com.ironhack.week6day3.Service.ClassesService;
import com.ironhack.week6day3.model.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ClassesController {

    @Autowired
    ClassesService classesService;

    @GetMapping("/classes")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Classes> findAll(){
        return classesService.findAllClasses();
    }

    @PostMapping("/new_class")
    @ResponseStatus(HttpStatus.CREATED)
    public Classes createAClass (@RequestBody Classes classes){
        return classesService.addNewClass(classes);
    }

    @DeleteMapping("/delete_class/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteAClass (@PathVariable Integer id){
        classesService.deleteClasses(id);
    }


}
