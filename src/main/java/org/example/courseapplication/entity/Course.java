package org.example.courseapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.example.courseapplication.enums.CourseStatus;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Course {

    @GeneratedValue
    @Id
    private Long id;

    private String name;

    private Double price;

    private String description;

    private CourseStatus status;
}
