package org.example.courseapplication.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CourseRequestDto {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotNull(message = "Price cannot be null")
    private Double price;

    private String description;
}
