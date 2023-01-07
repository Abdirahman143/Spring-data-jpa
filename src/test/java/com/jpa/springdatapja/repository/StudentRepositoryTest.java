package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    @Test
public void getAllStudent(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("studentList = " + studentList);

}

@Test
public void DeletingStudent(){
    studentRepository.delete(new Student());

    }


}