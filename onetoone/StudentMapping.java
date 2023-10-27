package com.springdata.Jpa.onetoone;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="student")
@ToString
public class StudentMapping {
    @Id
    private int roll;

    private String name;

    @OneToOne(optional = true)
    @JoinColumn(
            name="cid",
            referencedColumnName = "cid"
    )
    private CourseMapping course;

}
