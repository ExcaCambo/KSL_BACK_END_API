package org.khmerslide.services.implement;

import java.util.ArrayList;

import org.khmerslide.entities.Document;
import org.khmerslide.repositories.DocumentRepository;
import org.khmerslide.services.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImplement implements DocumentService {
	@Autowired
	private DocumentRepository documentRepository;

	@Override
	public ArrayList<Document> getDocument() {
		return documentRepository.getDocument();
	}
	@Override
	public boolean addDocument(Document document) {
		return documentRepository.addDocument(document);
	}

	@Override
	public boolean updateDocument(Document document) {
		return documentRepository.updateDocument(document);
	}

	@Override
	public boolean deleteDocument(int doc_id) {
		return documentRepository.deleteDocument(doc_id);
	}

}
