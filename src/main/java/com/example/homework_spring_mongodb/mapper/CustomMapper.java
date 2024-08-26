package com.example.homework_spring_mongodb.mapper;

import com.example.homework_spring_mongodb.domain.Section;
import com.example.homework_spring_mongodb.feature.course.dto.SectionResponse;
import com.example.homework_spring_mongodb.feature.course.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomMapper {

    private final CourseRepository courseRepository;
    private final SectionMapper sectionMapper;

    @Named("mapTotalCourse")
    public Integer mapTotalCourse(String categoryId) {
        return courseRepository.countByCategory(categoryId);
    }

    @Named("mapSectionResponse")
    public List<SectionResponse> mapSectionResponse(List<Section> sections) {

        return sections.stream().map(sectionMapper::mapToSectionResponse).collect(Collectors.toList());
    }

}