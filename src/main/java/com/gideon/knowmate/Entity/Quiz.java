package com.gideon.knowmate.Entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Document(collection = "quizzes")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {
    @Id
    private String id;

    private String userId;

    private String title;

    private String subject;

    private String course;

    @DBRef
    private User user;

    private List<Question> questions;

    private LocalDateTime time;

    @CreatedDate
    private Date createdAt;
}
