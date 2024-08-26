package com.example.homework_spring_mongodb.mapper;

import com.example.homework_spring_mongodb.domain.Category;
import com.example.homework_spring_mongodb.feature.category.dto.CategoryCreateRequest;
import com.example.homework_spring_mongodb.feature.category.dto.CategoryResponse;
import com.example.homework_spring_mongodb.feature.category.dto.CategoryUpdateRequest;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {CustomMapper.class})
public interface CategoryMapper {

    Category mapRequestToCategory(CategoryCreateRequest categoryCreateRequest);

    CategoryResponse mapToCategoryResponse(Category category);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void mapCategoryUpdateRequest(@MappingTarget Category category, CategoryUpdateRequest categoryUpdateRequest);

}