package com.example.homework_spring_mongodb.mapper;


import com.example.homework_spring_mongodb.domain.Course;
import com.example.homework_spring_mongodb.feature.course.dto.CourseCreateRequest;
import com.example.homework_spring_mongodb.feature.course.dto.CourseResponse;
import com.example.homework_spring_mongodb.feature.course.dto.CourseResponseDetail;
import com.example.homework_spring_mongodb.feature.course.dto.CourseUpdateRequest;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    CourseResponse mapToCourseResponse(Course course);

    CourseResponseDetail mapToCourseResponseDetail(Course course);

    Course mapRequestToCourse(CourseCreateRequest courseCreateRequest);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void mapCourseUpdateRequest(@MappingTarget Course course, CourseUpdateRequest courseUpdateRequest);
}