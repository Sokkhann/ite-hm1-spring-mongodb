package com.example.homework_spring_mongodb.feature.course;

import com.example.homework_spring_mongodb.feature.course.dto.*;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CourseService {

    void createCourse(CourseCreateRequest courseCreateRequest);

    VideoResponse createVideo(String id, VideoCreateRequest videoCreateRequest);

    SectionResponse createSection(String id, SectionCreateRequest sectionCreateRequest);

    CourseResponse getCourseById(String id);

    CourseResponse getCourseBySlug(Response response, String slug);

    List<CourseResponse> getCourseByInstructor(String instructor);

    Page<?> getAllCourses(Response response, int page, int size);

    Page<?> getCoursePublic(Response response, int page, int size);

    Page<?> getCoursePrivate(Response response, int page, int size);

    Page<?> getCourseFree(Response response, int page, int size);

    void updateCourse(String id, CourseUpdateRequest courseUpdateRequest);

    void updateCourseDraft(String id, DraftUpdateRequest draftUpdateRequest);

    void updateIsPaid(String id, CheckUpdateRequest checkUpdateRequest);

    void updateThumbnail(String id, ThumbnailUpdateRequest thumbnailUpdateRequest);

    void updateVideo(String id, VideoUpdateRequest videoUpdateRequest);

    void enableCourse(String id);

    void disableCourse(String id);

    void deleteCourse(String id);


}
