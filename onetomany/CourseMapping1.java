package com.springdata.Jpa.onetomany;

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
@Table(name="coursemapping1")
public class CourseMapping1 {
    @Id
    private int cid;

    private String name;
//Only one mapping is allowed
    @ManyToOne
    @JoinColumn(
            name="roll",
            referencedColumnName = "roll"
    )
    private StudentMapping1 student;
}
