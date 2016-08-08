package org.khmerslide.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Document {
	@JsonProperty("DOC_ID")
	private int doc_id;
	@JsonProperty("DOC_TITLE")
	private String doc_title;
	@JsonProperty("UPLOADED_DATE")
	private String uploaded_date;
	@JsonProperty("URL")
	private String url;
	@JsonProperty("LIKED")
	private int liked = 0;
	@JsonProperty("SHARED")
	private int shared = 0;
	@JsonProperty("VIEWED")
	private int viewed = 0;
	@JsonProperty("DESCRIPTION")
	private String description;
	private int status;
	private int  doc_type_id;
	private int user_id;
	private int  cat_id;
	private String thumbnail;
	
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getDoc_title() {
		return doc_title;
	}
	public void setDoc_title(String doc_title) {
		this.doc_title = doc_title;
	}
	public String getUploaded_date() {
		return uploaded_date;
	}
	public void setUploaded_date(String uploaded_date) {
		this.uploaded_date = uploaded_date;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getLiked() {
		return liked;
	}
	public void setLiked(int liked) {
		this.liked = liked;
	}
	public int getShared() {
		return shared;
	}
	public void setShared(int shared) {
		this.shared = shared;
	}
	public int getViewed() {
		return viewed;
	}
	public void setViewed(int viewed) {
		this.viewed = viewed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getDoc_type_id() {
		return doc_type_id;
	}
	public void setDoc_type_id(int doc_type_id) {
		this.doc_type_id = doc_type_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
}
