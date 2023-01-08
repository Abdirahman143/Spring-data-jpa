package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest{
    
    @Autowired
    private CourseRepository courseRepository;
    
    
    @Test
    public void getAllCourses(){
        List<Course> course = 
                courseRepository.findAll();

        System.out.println("course = " + course);
    }
    

}