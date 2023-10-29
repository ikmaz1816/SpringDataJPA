package com.springdata.Jpa.onetomany;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="studentmapping1")
@ToString
public class StudentMapping1 {
    @Id
    private int roll;

    private String name;

    @OneToMany
    @JoinColumn(
            name="roll",
            referencedColumnName = "roll"
    )
    private List<CourseMapping1> course;

}
