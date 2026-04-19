package com.hexagent.domain.port.out;

import com.hexagent.domain.model.News;
import com.hexagent.domain.model.Summary;

/**
 * Outbound port for summarizing news content.
 * The domain doesn't know if this is powered by Ollama, OpenAI, or a human.
 */
public interface SummarizerPort {
    
    /**
     * Consumes a full news article and generates a concise summary
     * with a sentiment score.
     * * @param news The original news article
     * @return The summarized version
     */
    Summary summarize(News news);
}