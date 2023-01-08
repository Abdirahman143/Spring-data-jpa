package com.jpa.springdatapja.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "courses")
public class Course {

    @Id
    @SequenceGenerator(
            name ="course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )
    private Long courseId;
    private String courseName;
    private Integer credit;

    @OneToOne(
            mappedBy = "course"
    )
   private CourseContent courseContent;

    @ManyToOne(
            cascade =  CascadeType.ALL
    )
    @JoinColumn(
            name = "lecturer_id",
            referencedColumnName = "lec_id"

    )
    private Lecturer lecturer;

@ManyToMany(
        cascade = CascadeType.ALL
)
    @JoinTable(
            name ="students_Courses",
            joinColumns = @JoinColumn(
                    name = "course_id",
                    referencedColumnName = "courseId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "students_id",
                    referencedColumnName = "student_id"
            )
    )
    private List<Student>students;


   public void AddStudent(Student student){
       if(students ==null)students= new LinkedList<>();
       students.add(student);
   }


}
