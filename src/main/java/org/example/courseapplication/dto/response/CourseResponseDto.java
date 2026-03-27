package org.example.courseapplication.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseResponseDto {

    Long id;

    String name;

    Double price;

    String description;
}
