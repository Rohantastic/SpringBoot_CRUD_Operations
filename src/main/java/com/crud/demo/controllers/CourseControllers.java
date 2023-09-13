package com.crud.demo.controllers;

import com.crud.demo.entity.Course;
import com.crud.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class CourseControllers {

    @Autowired
    CourseService courseService;



    @GetMapping("/course")
    public List<Course> getCourses() {
        return courseService.getCourses();
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable long id) {
        return courseService.getCourse(id);
    }
}
