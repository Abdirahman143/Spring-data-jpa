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
@Table(
        name = "students",
        uniqueConstraints =@UniqueConstraint(
                name = "email_address_unique",
                columnNames = "email_address"
        )
)
public class Student {

    @Id
    @SequenceGenerator(
            name ="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
                    )
    @Column(name = "student_id")
    private Long Id;
    private String firstName;
    private String lastName;
    @Column(nullable = false)
    private String email_address;
    private String guardianName;
    @Column(nullable = false)
    private String guardianEmail;
    private String guardianMobileNumber;

//    public Student(String firstName,
//                   String lastName,
//                   String email_address,
//                   String guardianName,
//                   String guardianEmail,
//                   String guardianMobileNumber) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email_address = email_address;
//        this.guardianName = guardianName;
//        this.guardianEmail = guardianEmail;
//        this.guardianMobileNumber = guardianMobileNumber;
//    }
}
