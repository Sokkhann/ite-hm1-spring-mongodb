package com.example.homework_spring_mongodb.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document(collection = "categories")
@Builder
public class Category {

    @Id
    private String id;
    private String uuid;
    private String name;
    private String icon;
    private Boolean isDeleted;
}
