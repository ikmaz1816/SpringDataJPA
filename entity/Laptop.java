package com.springdata.Jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tblLaptop",
    uniqueConstraints = @UniqueConstraint(
            columnNames = {"laptopId"}
    )
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Laptop {
    @SequenceGenerator(name="lap",
        sequenceName = "lap",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "lap"
    )
    private  int id;

    @Column(name="laptopId",nullable = false)
    @Id
    private String laptopId;

    @Column(name="laptopName",nullable = false)
    private String laptopName;
}
