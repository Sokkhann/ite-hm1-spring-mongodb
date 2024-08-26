package com.example.homework_spring_mongodb.feature.course.dto;

import com.example.homework_spring_mongodb.feature.course.dto.VideoCreateRequest;

import java.util.List;

public record SectionCreateRequest(
        String title,
        Integer orderNo,
        List<VideoCreateRequest> videos
) {
}
