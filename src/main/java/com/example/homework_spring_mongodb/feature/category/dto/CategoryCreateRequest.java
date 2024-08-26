package com.example.homework_spring_mongodb.feature.category.dto;

import jakarta.validation.constraints.NotEmpty;

public record CategoryCreateRequest (
        @NotEmpty(message = "Category name is required")
        String name,
        String icon
){
}
