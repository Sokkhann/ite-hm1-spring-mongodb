package com.example.homework_spring_mongodb.feature.course.dto;

public record VideoResponse(
        Integer sectionOrderNo,
        String lectureNo,
        Integer orderNo,
        String title,
        String fileName
) {
}
