package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.Guardian;
import com.jpa.springdatapja.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {


     @Autowired
    private StudentRepository studentRepository;
    @Test
    public void SaveStudentAndGuardian() {
        Guardian guardian = Guardian.builder()
                .name("Abdi Ali")
                .email("Abdi2@gmail.com")
                .mobile("079998090")
                .build();

        Student student = Student.builder()
                .firstName("Mohamed")
                .lastName("Muse")
                .email_address("Moha@gmail.com")
                .guardian(guardian)
                .build();

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