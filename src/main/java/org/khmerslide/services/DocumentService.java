package org.khmerslide.services;

import java.util.ArrayList;

import org.khmerslide.entities.Document;
import org.khmerslide.entities.User;
import org.khmerslide.utilities.Pagination;

public interface DocumentService {
	public ArrayList<Document> getDocument(Pagination pagination);
	public boolean addDocument(Document document);
	public boolean updateDocument(Document document);
	public boolean deleteDocument(int doc_id);
	public ArrayList<Document> getDocumentById(int doc_id);
}
