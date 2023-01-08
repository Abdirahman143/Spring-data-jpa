package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.Course;
import com.jpa.springdatapja.Entity.CourseContent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseContentRepositoryTest {

    @Autowired
    private CourseContentRepository courseContentRepository;


    @Test
    public void SaveCourseContent(){
        Course course =Course
                .builder()
                .courseName("System Programming")
                .credit(12)
                .build();
        CourseContent courseContent =
                CourseContent
                        .builder()
                        .url("WWWW.CBC/SystemProgramming")
                        .course(course)
                        .build();

        courseContentRepository.save(courseContent);
    }

    @Test
    public void getAllCourseContent(){
        List<CourseContent>courseContents =

                courseContentRepository.findAll();
        System.out.println("courseContents = " + courseContents);
    }

}