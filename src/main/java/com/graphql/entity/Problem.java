package com.graphql.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "problems")
public class Problem {

    @Id
    private UUID id;

    private String title;
    private String content;
    private String tags;

    @Transient
    private List<String> tag;

    @CreationTimestamp
    private LocalDateTime creationTimestamp;
}
