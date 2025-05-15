package com.clifford.groupapp.controller;

import com.clifford.groupapp.model.NewsletterContent;
import com.clifford.groupapp.model.NewsletterContent.Category;
import com.clifford.groupapp.service.NewsletterContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/newsletter")
@RequiredArgsConstructor
public class NewsletterContentController {

    private final NewsletterContentService newsletterContentService;

    @PostMapping
    public NewsletterContent postContent(@RequestBody NewsletterContent content) {
        return newsletterContentService.postContent(content);
    }

    @GetMapping("/category/{category}")
    public List<NewsletterContent> getByCategory(@PathVariable Category category) {
        return newsletterContentService.getContentByCategory(category);
    }
}
