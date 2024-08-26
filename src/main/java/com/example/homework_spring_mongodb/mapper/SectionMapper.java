package com.example.homework_spring_mongodb.mapper;

import com.example.homework_spring_mongodb.domain.Section;
import com.example.homework_spring_mongodb.feature.course.dto.SectionCreateRequest;
import com.example.homework_spring_mongodb.feature.course.dto.SectionResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SectionMapper {

    SectionResponse mapToSectionResponse(Section section);
    Section mapRequestToSection(SectionCreateRequest sectionCreateRequest);

}
