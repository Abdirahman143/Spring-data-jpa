package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {


     @Autowired
    private StudentRepository studentRepository;
    @Test
    public void SaveStudent() {
        Student student = Student.builder()
                .firstName("Abdirahman")
                .lastName("Bashir")
                .email_address("bashir@gmail.com")
                .guardianName("Abdi")
                .guardianEmail("Abdi@gmail.com")
                .guardianMobileNumber("0700098176").build();

        studentRepository.save(student);
    }



}