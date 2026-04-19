package com.hexagent.domain.port.out;

import com.hexagent.domain.model.News;
import java.util.List;

/**
 * Outbound port for fetching news articles from external sources.
 * The domain doesn't know if this uses an HTTP Client, an RSS reader, or an API.
 */
public interface NewsFetcherPort {
    
    /**
     * Fetches a list of news articles based on a specific topic.
     * * @param topic The subject to search for (e.g., "AI in Healthcare")
     * @return A list of News records matching the topic
     */
    List<News> fetch(String topic);
}