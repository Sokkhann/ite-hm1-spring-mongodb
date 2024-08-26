package com.example.homework_spring_mongodb.feature.course.dto;

public record VideoCreateRequest(
        Integer sectionOrderNo,
        String lectureNo,
        Integer orderNo,
        String title,
        String fileName
) {
}
