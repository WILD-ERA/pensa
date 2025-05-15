package com.clifford.groupapp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class NewsletterContent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String title;
    private String content;
    private LocalDateTime createdAt = LocalDateTime.now();

    public enum Category {
        EVENTS,
        GALLERY,
        INFORMATION
    }
}
