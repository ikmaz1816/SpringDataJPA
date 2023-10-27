package com.springdata.Jpa.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="course")
public class CourseMapping {
    @Id
    private int cid;

    private String name;
//Only one mapping is allowed
//    @OneToOne(mappedBy = "course")
//    private StudentMapping1 student;
}
