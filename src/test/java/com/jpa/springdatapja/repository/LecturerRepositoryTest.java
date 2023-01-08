package com.jpa.springdatapja.repository;
import com.jpa.springdatapja.Entity.Course;
import com.jpa.springdatapja.Entity.Lecturer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LecturerRepositoryTest {

    @Autowired
    private LecturerRepository lecturerRepository;

    @Test
    public void SaveLecturer(){
        Course Java = Course
                .builder()
                .courseName("Java")
                .credit(5)
                .build();
        Course DBA = Course
                .builder()
                .courseName("DBMS")
                .credit(7)
                .build();

        Lecturer lecturer = Lecturer
                .builder()
                .firstName("Asho")
                .lastName("Kahin")
                //.course(List.of(Java,DBA))
                .build();

        lecturerRepository.save(lecturer);

    }

}