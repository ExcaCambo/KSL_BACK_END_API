package org.khmerslide.entities;

public class Doc_Type {
	private int doc_type_id;
	private String doc_name;
	private int status;
	private String description;
	
	public int getDoc_type() {
		return doc_type_id;
	}
	public void setDoc_type(int doc_type_id) {
		this.doc_type_id = doc_type_id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
