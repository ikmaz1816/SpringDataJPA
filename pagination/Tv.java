package com.springdata.Jpa.pagination;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Tv {
    @Id
    private int id;

    private String name;
}
