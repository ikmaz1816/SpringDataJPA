package com.springdata.Jpa.manytomany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="coursemapping2")
public class CourseMapping2 {
    @Id
    private int cid;

    private String name;
//Only one mapping is allowed
    @ManyToMany(mappedBy = "course")
    private List<StudentMapping2> student;
}

