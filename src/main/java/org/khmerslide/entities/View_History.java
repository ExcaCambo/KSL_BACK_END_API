package org.khmerslide.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class View_History {
	@JsonProperty("VH_ID")
	private int vh_id;
	@JsonProperty("ADDED_DATE")
	private String added_date;
	@JsonProperty("USER_ID")
	private User  user;
	@JsonProperty("DOC_ID")
	private Document  doc;
	@JsonProperty("DESCRIPTION")
	private String description;
	@JsonProperty("STATUS")
	private int status;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
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
	
}
