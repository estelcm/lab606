package com.ironhack.week6day3;

import com.ironhack.week6day3.Repository.ClassesRepository;
import com.ironhack.week6day3.model.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week6day3Application implements CommandLineRunner {

	@Autowired
	ClassesRepository classesRepository;

	public static void main(String[] args) {
		SpringApplication.run(Week6day3Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		classesRepository.save(new Classes("class1","description1"));
		classesRepository.save(new Classes("class2","description2"));
		classesRepository.save(new Classes("class3","description3"));
		classesRepository.save(new Classes("class4","description4"));
		classesRepository.save(new Classes("class5","description5"));
		classesRepository.save(new Classes("class6","description6"));
		classesRepository.save(new Classes("class7","description7"));
		classesRepository.save(new Classes("class8","description8"));
		classesRepository.save(new Classes("class9","description9"));
		classesRepository.save(new Classes("class10","description10"));
	}
}
