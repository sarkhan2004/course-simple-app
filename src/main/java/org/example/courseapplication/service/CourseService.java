package org.example.courseapplication.service;

import lombok.RequiredArgsConstructor;
import org.example.courseapplication.dto.request.CourseRequestDto;
import org.example.courseapplication.dto.response.CourseResponseDto;
import org.example.courseapplication.entity.Course;
import org.example.courseapplication.enums.CourseStatus;
import org.example.courseapplication.mapper.CourseMapper;
import org.example.courseapplication.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;


    public CourseResponseDto getCourseById(Long id) {
        Course response = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
        return CourseMapper.toResponseDto(response);
    }

    public CourseResponseDto createCourse(CourseRequestDto request) {
        Course course = CourseMapper.toEntity(request);
        course.setStatus(CourseStatus.ACTIVE);
        Course savedCourse = courseRepository.save(course);
        return CourseMapper.toResponseDto(savedCourse);
    }

    public void deleteCourse(Long id) {
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
        course.setStatus(CourseStatus.INACTIVE);
        courseRepository.save(course);
    }
}
