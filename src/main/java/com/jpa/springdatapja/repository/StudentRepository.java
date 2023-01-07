package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

           List<Student>findByFirstName(String firstName);
           List<Student>findByFirstNameContaining(String firstName);
           List<Student>findByGuardianName(String firstName);
           List<Student>findByLastName(String lastName);
}
