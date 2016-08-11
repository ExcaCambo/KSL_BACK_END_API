package org.khmerslide.services.implement;

import java.util.ArrayList;

import javax.xml.crypto.dom.DOMCryptoContext;

import org.khmerslide.entities.Document;
import org.khmerslide.repositories.DocumentRepository;
import org.khmerslide.services.DocumentService;
import org.khmerslide.utilities.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImplement implements DocumentService {
	@Autowired
	private DocumentRepository documentRepository;

	@Override
	public ArrayList<Document> getDocument(Pagination pagination,String doc_type) {
		return documentRepository.getDocument(pagination,doc_type);
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
	@Override
	public ArrayList<Document> getDocumentById(int doc_id) {
		return documentRepository.getDocumentById(doc_id);
	}
	@Override
	public ArrayList<Document> getDocumentType(Pagination pagination,String doc_type) {
		return documentRepository.getDocumentType(pagination,doc_type);
	}

}
