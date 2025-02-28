package org.springframework.ai.document;

import java.util.List;
import java.util.Map;

/**
 * Interface for a document storage system that can retrieve documents by their IDs.
 */
public interface DocumentStore extends Map<String, Document> {

	/**
	 * Retrieves a list of documents by their IDs.
	 *
	 * @param ids The list of document IDs to retrieve.
	 * @return The list of retrieved documents.
	 */
	List<Document> get(List<String> ids);
}
