package com.example.homework_spring_mongodb.util;

import com.example.homework_spring_mongodb.domain.Course;
import com.example.homework_spring_mongodb.feature.course.dto.CourseResponse;
import com.example.homework_spring_mongodb.feature.course.dto.CourseResponseDetail;
import com.example.homework_spring_mongodb.feature.course.dto.Response;
import com.example.homework_spring_mongodb.mapper.CourseMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.stream.Collectors;

public class ResponseUtils {

    public static Page<?> mapCoursesResponse(List<Course> courses, Response response, CourseMapper courseMapper, Pageable pageable, long total) {
        if (response == Response.CONTENT_DETAILS) {
            // Map courses to CourseResponseDetail DTOs
            List<CourseResponseDetail> courseResponseDetails = courses.stream()
                    .map(courseMapper::mapToCourseResponseDetail)
                    .collect(Collectors.toList());
            return new PageImpl<>(courseResponseDetails, pageable, total);
        } else {
            // Map courses to CourseResponse DTOs
            List<CourseResponse> courseResponses = courses.stream()
                    .map(courseMapper::mapToCourseResponse)
                    .collect(Collectors.toList());
            return new PageImpl<>(courseResponses, pageable, total);
        }
    }
}


