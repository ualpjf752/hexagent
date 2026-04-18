package com.hexagent.domain.model;

import java.net.URI;
import java.time.LocalDate;

/**
 * Represents a single news article fetched by the search agent.
 * This is a domain model, kept pure and decoupled from external frameworks.
 */
public record News(
    String title,
    String content,
    String source,
    URI url,
    LocalDate publishedAt
) {
    /**
     * Compact constructor for validation.
     * Ensures that the business rules of the domain are respected.
     */
    public News {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("News title cannot be empty");
        }
        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("News content cannot be empty");
        }
    }
}