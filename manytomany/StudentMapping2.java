package com.springdata.Jpa.manytomany;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="studentmapping2")
@ToString
public class StudentMapping2 {
    @Id
    private int roll;

    private String name;

    @ManyToMany
    @JoinTable(
       joinColumns = @JoinColumn(
               name="roll",
               referencedColumnName = "roll"
       ),
       inverseJoinColumns = @JoinColumn(
               name="cid",
            referencedColumnName = "cid"
    )
    )
    private List<CourseMapping2> course;

}
