package com.jpa.springdatapja.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "course_contents")
public class CourseContent {

    @Id
    @SequenceGenerator(
            name = "course_content_sequence",
            sequenceName = "course_content_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_content_sequence"
    )
    @Column(name = "course_content_id")
    private Long Id;
    private String url;
    @OneToOne
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;

}
