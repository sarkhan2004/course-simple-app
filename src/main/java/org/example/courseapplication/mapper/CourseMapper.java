package org.example.courseapplication.mapper;


import lombok.RequiredArgsConstructor;
import org.example.courseapplication.dto.request.CourseRequestDto;
import org.example.courseapplication.dto.response.CourseResponseDto;
import org.example.courseapplication.entity.Course;


public class CourseMapper {

    public static CourseResponseDto toResponseDto(Course course) {
        CourseResponseDto responseDto = new CourseResponseDto();
        responseDto.setId(course.getId());
        responseDto.setName(course.getName());
        responseDto.setPrice(course.getPrice());
        return responseDto;
    }

    public static Course toEntity(CourseRequestDto request) {
        Course course = new Course();
        course.setName(request.getName());
        course.setPrice(request.getPrice());
        course.setDescription(request.getDescription());
        return course;
    }
}
