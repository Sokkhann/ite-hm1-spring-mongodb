package com.example.homework_spring_mongodb.feature.category;

import com.example.homework_spring_mongodb.domain.Category;
import com.example.homework_spring_mongodb.feature.category.dto.CategoryCreateRequest;
import com.example.homework_spring_mongodb.feature.category.dto.CategoryResponse;
import com.example.homework_spring_mongodb.feature.category.dto.CategoryUpdateRequest;
import com.example.homework_spring_mongodb.feature.course.CourseRepository;
import com.example.homework_spring_mongodb.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    private final MongoTemplate mongoTemplate;
    private final CourseRepository courseRepository;

    private final String url = "http://localhost:8080/images/";

    @Override
    public void createCategory(CategoryCreateRequest categoryCreateRequest) {

        if (categoryRepository.existsByName(categoryCreateRequest.name())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Category already exists");
        }

        Category newCategory = categoryMapper.mapRequestToCategory(categoryCreateRequest);
        newCategory.setName(categoryCreateRequest.name());
        newCategory.setIcon(url + categoryCreateRequest.icon());
        newCategory.setIsDeleted(false);
        categoryRepository.save(newCategory);
    }

    @Override
    public List<CategoryResponse> getAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(categoryMapper::mapToCategoryResponse)
                .toList();
    }

    @Override
    public CategoryResponse getCategoryById(String id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));

        return categoryMapper.mapToCategoryResponse(category);
    }

    @Override
    public void updateCategory(String id, CategoryUpdateRequest categoryUpdateRequest) {

        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));

        category.setIcon(url + categoryUpdateRequest.icon());
        categoryMapper.mapCategoryUpdateRequest(category, categoryUpdateRequest);
        categoryRepository.save(category);
    }

    @Override
    public void disableCategory(String id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));

        category.setIsDeleted(true);
        categoryRepository.save(category);
    }

    @Override
    public void enableCategory(String id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));

        category.setIsDeleted(false);
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(String id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));

        categoryRepository.delete(category);
    }
}
