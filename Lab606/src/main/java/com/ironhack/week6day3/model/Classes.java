package com.ironhack.week6day3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Classes {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;


    public Classes() {
    }

    public Classes(String title, String description) {
        this.title = title;
        this.description = description;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*
    Back-End
Create a new Spring Boot application.
Create a SQL table called classes that has an id, title, and description of each class that a fictional school offers.
Add at least 10 classes to the table.// main.
Create a simple REST API on top of the database with a GET route to get all classes.
Add a POST route to add a class
     */
}
