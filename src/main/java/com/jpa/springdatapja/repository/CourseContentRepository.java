package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.CourseContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseContentRepository extends JpaRepository<CourseContent, Long> {
}
