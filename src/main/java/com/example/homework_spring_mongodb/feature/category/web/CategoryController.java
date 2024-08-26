package com.example.homework_spring_mongodb.feature.category.web;

import com.example.homework_spring_mongodb.feature.category.CategoryService;
import com.example.homework_spring_mongodb.feature.category.dto.CategoryCreateRequest;
import com.example.homework_spring_mongodb.feature.category.dto.CategoryResponse;
import com.example.homework_spring_mongodb.feature.category.dto.CategoryUpdateRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCategory(@RequestBody @Valid CategoryCreateRequest categoryCreateRequest) {
        categoryService.createCategory(categoryCreateRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CategoryResponse> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryResponse getCategoryById(@PathVariable String id) {
        return categoryService.getCategoryById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateCategory(@PathVariable String id, @RequestBody @Valid CategoryUpdateRequest categoryUpdateRequest) {
        categoryService.updateCategory(id, categoryUpdateRequest);
    }

    @PutMapping("/{id}/enable")
    @ResponseStatus(HttpStatus.OK)
    public void enableCategory(@PathVariable String id) {
        categoryService.enableCategory(id);
    }

    @PutMapping("/{id}/disable")
    @ResponseStatus(HttpStatus.OK)
    public void disableCategory(@PathVariable String id) {
        categoryService.disableCategory(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCategory(@PathVariable String id) {
        categoryService.deleteCategory(id);
    }
}
