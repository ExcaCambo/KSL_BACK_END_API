package org.khmerslide.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comment {
	@JsonProperty("CMT_ID")
	private int cmt_id;
	@JsonProperty("CMT_TEXT")
	private String cmt_text;
	@JsonProperty("CMT_DATE")
	private String cmt_date;
	@JsonProperty("STATUS")
	private int status;
	@JsonProperty("USER_ID")
	private int user_id;
	@JsonProperty("DOC_ID")
	private int  doc_id;
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
}
