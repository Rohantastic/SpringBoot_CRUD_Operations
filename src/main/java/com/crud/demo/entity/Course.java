package com.crud.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String title;
    public String description;

    public Course(long id, String title,String description){
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Course(){
        super();
    }

}
