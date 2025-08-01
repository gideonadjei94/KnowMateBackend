package com.gideon.knowmate.Entity;


import com.gideon.knowmate.Enum.Scope;
import com.gideon.knowmate.Enum.SubjectDomain;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document(collection = "flashcard-sets")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FlashCardSet {

    @Id
    private String id;


    private String userId;
    private String username;

    private String title;
    private String description;

    private SubjectDomain subjectDomain;
    private String course;
    private Scope accessScope = Scope.PRIVATE;

    private List<FlashCard> flashCardList;

    private List<String> likeBy = new ArrayList<>();

    private List<String> viewedBy = new ArrayList<>();

    private List<String> savedBy = new ArrayList<>();

    private List<String> sharedBy = new ArrayList<>();

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date lastUpdated;

}
