package com.example.homework_spring_mongodb.feature.category;

import com.example.homework_spring_mongodb.domain.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CategoryRepository extends MongoRepository<Category, String> {
    Boolean existsByName(String name);
    Optional<Category> findByName(String name);
}
