package com.example.homework_spring_mongodb.feature.course.dto;

import jakarta.validation.constraints.NotNull;

public record ThumbnailUpdateRequest(
        @NotNull(message = "Thumbnail is required")
        String thumbnail
) {
}
