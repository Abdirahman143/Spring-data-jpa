package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.Guardian;
import com.jpa.springdatapja.Entity.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {


     @Autowired
    private StudentRepository studentRepository;
    @Test
    public void SaveStudentAndGuardian() {
        Guardian guardian = Guardian.builder()
                .name("Ondinya")
                .email("AO@gmail.com")
                .mobile("0799989000")
                .build();

        Student student = Student.builder()
                .firstName("Emmanuel")
                .lastName("Ondinya")
                .email_address("ondinya@gmail.com")
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
public void DeletingStudentByLastName(){
    List<Student>lastName =studentRepository.removeByLastName("Bashir");

    }

    @Test
    public  void getFirstName(){
       List<Student> student = studentRepository.findByFirstName("Mohamed");
        System.out.println("student = " + student);
        //gAssertions.assertEquals(student.toString(), "Mohamed");

    }

    @Test
    public void getFirstNameContaining(){
        List<Student>firstName = studentRepository.findByFirstNameContaining("Ab");
        System.out.println("firstName = " + firstName);
    }

    @Test
    public void getGuardianName(){
        List<Student>name = studentRepository.findByGuardianName("Abdi");
        System.out.println("name = " + name);
    }
    @Test
    public void getLastNameOfStudent(){
        List<Student>lastName = studentRepository.findByLastName("Muse");
        System.out.println("lastName = " + lastName);
    }

 @Test
    public void findStudentByEmailAddress(){
        Student student =
                studentRepository.findStudentByEmailAddress("bashir@gmail.com");
     System.out.println("student = " + student);
    }
    @Test
    public void findFirstNameByEmailAddress(){
        String firstName = 
                studentRepository.findFirstNameByEmailAddress("bashir@gmail.com");
        System.out.println("firstName = " + firstName);
    }

    @Test
    public void findStudentByEmailAddressNative(){
        List<Student>emailNative =
                studentRepository.findStudentByEmailAddressNative("Moha@gmail.com");
    }


    @Test
    public void updateStudentNameByEmailIdTest(){
        studentRepository.updateStudentNameByEmailId(
                "Apdulrahman Bashir",
                "bashir@gmail.com"
        );
    }

}