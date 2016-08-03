package org.khmerslide.entities;

public class View_History {
	private int vh_id;
	private String added_date;
	private User  user_id;
	private Document  doc_id;
	private String description;
	
	public int getVh_id() {
		return vh_id;
	}
	public void setVh_id(int vh_id) {
		this.vh_id = vh_id;
	}
	public String getAdded_date() {
		return added_date;
	}
	public void setAdded_date(String added_date) {
		this.added_date = added_date;
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
