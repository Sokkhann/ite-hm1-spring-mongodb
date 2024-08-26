package com.example.homework_spring_mongodb.feature.course;

import com.example.homework_spring_mongodb.domain.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CourseRepository extends MongoRepository<Course, String> {
    Boolean existsByTitle(String title);

    Page<Course> findByIsDraftedFalse(Pageable pageable);

    Page<Course> findByIsPaidFalse(Pageable pageable);

    Page<Course> findByIsDraftedTrue(Pageable pageable);

    Integer countByCategory(String categoryId);
}
