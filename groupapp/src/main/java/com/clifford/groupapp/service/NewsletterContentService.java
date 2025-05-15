package com.clifford.groupapp.service;

import com.clifford.groupapp.model.NewsletterContent;
import com.clifford.groupapp.model.NewsletterContent.Category;
import com.clifford.groupapp.repository.NewsletterContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsletterContentService {

    private final NewsletterContentRepository newsletterContentRepository;

    public NewsletterContent postContent(NewsletterContent content) {
        return newsletterContentRepository.save(content);
    }

    public List<NewsletterContent> getContentByCategory(Category category) {
        return newsletterContentRepository.findByCategoryOrderByCreatedAtDesc(category);
    }
}
