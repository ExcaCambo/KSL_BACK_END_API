package org.khmerslide.model;



import com.fasterxml.jackson.annotation.JsonProperty;

public class InputComment {
	@JsonProperty("CMT_TEXT")
	private String cmt_text;
	@JsonProperty("CMT_DATE")
	private String cmt_date;
	@JsonProperty("STATUS")
	private int status;
	@JsonProperty("USER_ID")
	private int user;
	@JsonProperty("DOC_ID")
	private int  doc;
	@JsonProperty("DISCRIPTION")
	private String description;
	
	public String getCmt_date() {
		return cmt_date;
	}
	public void setCmt_date(String cmt_date) {
		this.cmt_date = cmt_date;
	}
	public String getCmt_text() {
		return cmt_text;
	}
	public void setCmt_text(String cmt_text) {
		this.cmt_text = cmt_text;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public int getDoc() {
		return doc;
	}
	public void setDoc(int doc) {
		this.doc = doc;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public static class UpdateComment{
		@JsonProperty("CMT_TEXT")
		private String cmt_text;

		public String getCmt_text() {
			return cmt_text;
		}

		public void setCmt_text(String cmt_text) {
			this.cmt_text = cmt_text;
		}
		
	}
}
