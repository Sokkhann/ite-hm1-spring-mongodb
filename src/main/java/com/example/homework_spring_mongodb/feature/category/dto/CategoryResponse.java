package com.example.homework_spring_mongodb.feature.category.dto;

public record CategoryResponse (
        String id,
        String name,
        String icon,
        Boolean isDisabled
) {
}
