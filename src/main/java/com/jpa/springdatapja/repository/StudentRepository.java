package com.jpa.springdatapja.repository;

import com.jpa.springdatapja.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

           List<Student>findByFirstName(String firstName);
           List<Student>findByFirstNameContaining(String firstName);
           List<Student>findByGuardianName(String firstName);
           List<Student>findByLastName(String lastName);

           @Query(
                   "select s from Student s where s.email_address=?1"
           )
           Student findStudentByEmailAddress(String email_address);


           @Query(
                   "select s.firstName from Student s where s.email_address=?1"
           )
           String findFirstNameByEmailAddress(String email_address);

           List<Student>removeByLastName(String LastName);

           //using Native Query
//Native query
    @Query(
            value = "SELECT * FROM students s where s.email_address=?1",
            nativeQuery = true
    )
        List<Student>findStudentByEmailAddressNative(String email);




}
