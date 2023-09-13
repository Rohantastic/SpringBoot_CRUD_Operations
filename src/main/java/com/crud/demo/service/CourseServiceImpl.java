package com.crud.demo.service;

import com.crud.demo.dao.CourseDao;
import com.crud.demo.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long id) {
        return courseDao.getById(id);
    }

    @Override
    public Course addCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public void deleteCourse(long id) {
        Course c = courseDao.getOne(id);
        courseDao.delete(c);
    }
}
