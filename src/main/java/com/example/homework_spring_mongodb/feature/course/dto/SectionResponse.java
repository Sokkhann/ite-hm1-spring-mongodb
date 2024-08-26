package com.example.homework_spring_mongodb.feature.course.dto;

import com.example.homework_spring_mongodb.feature.course.dto.VideoResponse;

import java.util.List;

public record SectionResponse(
        String title,
        Integer orderNo,
        List<VideoResponse> videos
) {
}
