package org.example.courseapplication.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.courseapplication.dto.request.CourseRequestDto;
import org.example.courseapplication.dto.response.CourseResponseDto;
import org.example.courseapplication.service.CourseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/{id}")
    public CourseResponseDto getCourseById(@Valid @PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public CourseResponseDto createCourse(@Valid @RequestBody CourseRequestDto request) {
        return courseService.createCourse(request);
    }

    @DeleteMapping
    public void deleteCourse(@Valid @PathVariable Long id) {
        courseService.deleteCourse(id);
    }

}
