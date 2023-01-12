package com.jpa.springdatapja.Controller;

import com.jpa.springdatapja.Entity.Course;
import com.jpa.springdatapja.repository.CourseRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;

    }

    @GetMapping()
    public List<Course>findAllCourses(){
             return courseRepository.findAll();

    }

    @GetMapping("/{id}")
    public Optional<Course> FindOneCourse(@PathVariable Long id){
        if(id==null){
            ResponseEntity.status(404);
        }

        return courseRepository.findById(id);
    }



}
