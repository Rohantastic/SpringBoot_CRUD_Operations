package com.crud.demo.service;

import com.crud.demo.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long id);

    public Course addCourse(Course course);

    public void deleteCourse(long id);
}
