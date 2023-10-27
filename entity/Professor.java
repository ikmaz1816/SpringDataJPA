package com.springdata.Jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tbl_professor")
public class Professor {
    @Id
    @Column(name="pid")
    private int id;

    @Column(name="profName",nullable = false)
    private String professorName;

//    @Column(name="courseid")
//    private String courseId;
//
//    @Column(name="coursename")
//    private String courseName;

    @Embedded
    private Course course;


}
