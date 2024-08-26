package com.example.homework_spring_mongodb.feature.course.dto;

import jakarta.validation.constraints.NotNull;

public record DraftUpdateRequest(
        @NotNull(message = "Status is required")
        Boolean status
) {
}
