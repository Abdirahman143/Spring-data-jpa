package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student>findByFirstName(String firstName);
}
