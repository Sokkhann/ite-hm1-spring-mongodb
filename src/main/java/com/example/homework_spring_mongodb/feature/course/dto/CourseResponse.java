package com.example.homework_spring_mongodb.feature.course.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CourseResponse(
        String id,
        String uuid,
        String title,
        String slug,
        String description,
        String thumbnail,
        String contents,
        BigDecimal price,
        Integer discount,
        String categoryName,
        String code,
        String instructorUsername,
        Boolean isPaid,
        Boolean isDrafted,
        Boolean isDeleted,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
