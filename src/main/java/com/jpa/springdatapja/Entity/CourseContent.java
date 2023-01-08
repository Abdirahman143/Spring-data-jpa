package com.jpa.springdatapja.Entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "course")
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
    @OneToOne(
            cascade=CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;

}
