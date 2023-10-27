package com.springdata.Jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name="tbl_student",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"studentEmail"}
        )
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Student {
    @Id
    @Column(name="studentId")
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private int id;

    @Column(name="studentName",nullable = false)
    private String name;

    @Column(name="studentAddress")
    private String address;

    @Column(name="studentEmail")
    private String email;
}
