package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.Document;

public interface DocumentService {
	public ArrayList<Document> getDocument();
	public boolean addDocument(Document document);
	public boolean updateDocument(Document document);
	public boolean deleteDocument(int doc_id);
}
