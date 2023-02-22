package com.ironhack.week6day3.Service;

import com.ironhack.week6day3.Repository.ClassesRepository;
import com.ironhack.week6day3.model.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ClassesService {

    @Autowired
    ClassesRepository classesRepository;

    public List<Classes> findAllClasses(){
        return classesRepository.findAll();
    }

    public Classes addNewClass(Classes classes){
        Classes newClass= new Classes(classes.getTitle(),classes.getDescription());
        return classesRepository.save(classes);
    }

    public void deleteClasses (Integer id){
classesRepository.delete(classesRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Class not found")));
    }

}
