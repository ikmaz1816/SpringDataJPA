package com.springdata.Jpa.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AttributeOverrides(
        {
            @AttributeOverride(
                    name="id",
                    column=@Column(name="courseid")
            ),
            @AttributeOverride(
                    name="name",
                    column=@Column(name="coursename")
            )
        }
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//If some entries are already then we use AttributeOverrides
public class Course {

    private String id;
    private String name;
}
