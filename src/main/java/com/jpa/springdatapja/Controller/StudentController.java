package com.jpa.springdatapja.Controller;

import com.jpa.springdatapja.Entity.Student;
import com.jpa.springdatapja.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    public StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @GetMapping("/Names/{firstName}")
    public List<Student> getFirstName(@PathVariable String firstName){
        List<Student> name = studentRepository.findByFirstName(firstName);
        return name;

    }


    @PostMapping("/Create")
    public ResponseEntity<?>CreateNewStudent(@RequestBody Student student){
        studentRepository.save(student);
        return  ResponseEntity.ok(student);

    }
}
