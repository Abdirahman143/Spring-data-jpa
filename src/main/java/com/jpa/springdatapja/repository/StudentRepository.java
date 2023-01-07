package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
