package org.khmerslide.entities;

public class Comment {
	private int cmt_id;
	private String cmt_name;
	private String cmt_date;
	private int status;
	private User user_id;
	private Document  doc_id;
	private String description;
	public int getCmt_id() {
		return cmt_id;
	}
	public void setCmt_id(int cmt_id) {
		this.cmt_id = cmt_id;
	}
	public String getCmt_name() {
		return cmt_name;
	}
	public void setCmt_name(String cmt_name) {
		this.cmt_name = cmt_name;
	}
	public String getCmt_date() {
		return cmt_date;
	}
	public void setCmt_date(String cmt_date) {
		this.cmt_date = cmt_date;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User getUser_id() {
		return user_id;
	}
	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	public Document getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(Document doc_id) {
		this.doc_id = doc_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}
