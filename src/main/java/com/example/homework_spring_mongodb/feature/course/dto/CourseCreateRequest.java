package com.example.homework_spring_mongodb.feature.course.dto;

import java.math.BigDecimal;

public record CourseCreateRequest(
        String title,
        String slug,
        String description,
        String thumbnail,
        String contents,
        BigDecimal price,
        Integer discount,
        String categoryName,
        String instructorUsername
) {
}
