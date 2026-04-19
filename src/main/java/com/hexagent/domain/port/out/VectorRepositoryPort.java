package com.hexagent.domain.port.out;

import com.hexagent.domain.model.Summary;

/**
 * Outbound port for persisting data into a vector storage.
 * The domain doesn't know if this is Milvus, Pinecone, or just an in-memory list.
 */
public interface VectorRepositoryPort {
    
    /**
     * Saves a summary into the vector database for future semantic search.
     * * @param summary The summary to be stored
     */
    void save(Summary summary);
}