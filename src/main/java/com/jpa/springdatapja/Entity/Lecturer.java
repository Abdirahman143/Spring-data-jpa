package com.jpa.springdatapja.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        name = "lecturers"
)
public class Lecturer {

    @Id
    @SequenceGenerator(
            name = "lecturer_sequence",
            sequenceName = "lecturer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "lecturer_sequence"
    )
    private Long lec_id;
    private String firstName;
    private String lastName;
    @OneToMany(
            cascade =  CascadeType.ALL
    )
    @JoinColumn(
            name = "lecturer_id",
            referencedColumnName = "lec_id"
    )
   private List<Course> course;
}
