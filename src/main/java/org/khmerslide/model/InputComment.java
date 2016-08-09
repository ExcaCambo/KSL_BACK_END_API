package org.khmerslide.model;



import org.khmerslide.entities.Document;
import org.khmerslide.entities.User;

public class InputComment {
	private int cmt_id;
	private String cmt_text;
	private String cmt_date;
	private int status;
	private User user;
	private Document  doc;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Document getDoc() {
		return doc;
	}
	public void setDoc(Document doc) {
		this.doc = doc;
	}
	public int getCmt_id() {
		return cmt_id;
	}
	public void setCmt_id(int cmt_id) {
		this.cmt_id = cmt_id;
	}
	public String getCmt_text() {
		return cmt_text;
	}
	public void setCmt_text(String cmt_text) {
		this.cmt_text = cmt_text;
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
	
	
}
