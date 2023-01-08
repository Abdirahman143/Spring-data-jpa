package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.Course;
import com.jpa.springdatapja.Entity.CourseContent;
import com.jpa.springdatapja.Entity.Lecturer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;
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


    @Test
    public void SaveCourseWithLecturer(){
        CourseContent content = CourseContent
                .builder()
                .url("WWW.CBC/CsharpTutorial.com")
                .build();
        Lecturer lecturer = Lecturer.builder()
                .firstName("Rhoad")
                .lastName("Omar")
                .build();
        Course Csharp = Course.builder()
                .courseName("C sharp")
                .credit(8)
                .lecturer(lecturer)
               // .courseContent(content)
                .build();

        courseRepository.save(Csharp);
    }


    @Test
    public void findAllPagination(){
        PageRequest firstThreeRecords =
                PageRequest.of(0,3);
   PageRequest secondPageWithTwoRecord = PageRequest.of(1,2);

        List<Course>courses =
                courseRepository.findAll(firstThreeRecords).getContent();
        System.out.println("courses = " + courses);

        Long totalElements = courseRepository.findAll(firstThreeRecords).getTotalElements();
        System.out.println("totalElements = " + totalElements);

        Long totalPage = Long.valueOf(courseRepository.findAll(firstThreeRecords).getTotalPages());
        System.out.println("totalPage = " + totalPage);



    }
    

}