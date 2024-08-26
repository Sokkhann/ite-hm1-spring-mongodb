package com.example.homework_spring_mongodb.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sections")
public class Section {

    @Id
    private String id;
    private String title;
    private Integer orderNo;
    private List<Video> videos;
}
