package com.example.homework_spring_mongodb.feature.category;

import com.example.homework_spring_mongodb.feature.category.dto.CategoryCreateRequest;
import com.example.homework_spring_mongodb.feature.category.dto.CategoryResponse;
import com.example.homework_spring_mongodb.feature.category.dto.CategoryUpdateRequest;

import java.util.List;

public interface CategoryService{
    void createCategory(CategoryCreateRequest categoryCreateRequest);

    List<CategoryResponse> getAllCategories();

    CategoryResponse getCategoryById(String id);


    void updateCategory(String id, CategoryUpdateRequest categoryUpdateRequest);

    void disableCategory(String id);

    void enableCategory(String id);

    void deleteCategory(String id);
}
