package com.example.homework_spring_mongodb.feature.course.dto;

public record VideoUpdate (
        Integer sectionOrderNo,
        String lectureNo,
        Integer orderNo,
        String title,
        String fileName
) {
}
