package com.example.homework_spring_mongodb.mapper;

import com.example.homework_spring_mongodb.domain.Video;
import com.example.homework_spring_mongodb.feature.course.dto.VideoCreateRequest;
import com.example.homework_spring_mongodb.feature.course.dto.VideoResponse;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface VideoMapper {

    VideoResponse mapToVideoResponse(Video video);

    Video mapRequestToVideo(VideoCreateRequest videoCreateRequest);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void mapToVideoUpdateRequest(@MappingTarget Video video, VideoCreateRequest videoCreateRequest);
}

