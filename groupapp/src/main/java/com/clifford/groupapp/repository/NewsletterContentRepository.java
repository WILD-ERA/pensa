package com.clifford.groupapp.repository;

import com.clifford.groupapp.model.NewsletterContent;
import com.clifford.groupapp.model.NewsletterContent.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsletterContentRepository extends JpaRepository<NewsletterContent, Long> {
    List<NewsletterContent> findByCategoryOrderByCreatedAtDesc(Category category);
}
