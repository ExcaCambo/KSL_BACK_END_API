package org.khmerslide.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class View_History {
	@JsonProperty("VH_ID")
	private int vh_id;
	@JsonProperty("ADDED_DATE")
	private String added_date;
	@JsonProperty("USER_ID")
	private int  user_id;
	@JsonProperty("DOC_ID")
	private int  doc_id;
	@JsonProperty("DESCRIPTION")
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
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
