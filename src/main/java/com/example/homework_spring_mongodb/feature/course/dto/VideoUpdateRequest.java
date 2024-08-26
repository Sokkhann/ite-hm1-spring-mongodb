package com.example.homework_spring_mongodb.feature.course.dto;

import java.util.List;

public record VideoUpdateRequest(
        String sectionOrderNo,
        List<VideoUpdate> videos
) {
}
