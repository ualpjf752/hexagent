package com.hexagent.domain.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * The final output of our orchestrator.
 * It contains the overall conclusion and the individual summaries.
 */
public record MarketAnalysis(
    String topic,
    List<Summary> summaries,
    String overallConclusion,
    LocalDateTime analyzedAt
) {
    public MarketAnalysis {
        if (topic == null || topic.isBlank()) {
            throw new IllegalArgumentException("Topic cannot be empty");
        }
        if (summaries == null || summaries.isEmpty()) {
            throw new IllegalArgumentException("An analysis must contain at least one summary");
        }
        // Defensive copy to ensure true immutability of the list
        summaries = List.copyOf(summaries);
    }
}