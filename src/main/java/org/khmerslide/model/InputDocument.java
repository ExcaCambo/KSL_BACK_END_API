package org.khmerslide.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class InputDocument {
	@JsonProperty("DOC_TITLE")
	private String doc_title;
	@JsonProperty("DESCRIPTION")
	private String description;
	
	
	public String getDoc_title() {
		return doc_title;
	}

	public void setDoc_title(String doc_title) {
		this.doc_title = doc_title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@JsonProperty("STATUS")
	private int status;
	@JsonProperty("DOC")
	private int  doc_type_id;
	@JsonProperty("USER")
	private int user_id;
	@JsonProperty("CATEGORY")
	private int  cat_id;
	@JsonProperty("THUMBNAIL")
	private String thumbnail;
	@JsonProperty("SOURCE")
	private String source;

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
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public static class insertDocument extends InputDocument{
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
		
	}
	
	public static class UpdateDocument extends InputDocument{
		
		@JsonProperty("STATUS")
		private int status;
		@JsonProperty("DOC")
		private int  doc_type_id;
		@JsonProperty("USER")
		private int user_id;
		@JsonProperty("CATEGORY")
		private int  cat_id;
		@JsonProperty("THUMBNAIL")
		private String thumbnail;
		@JsonProperty("SOURCE")
		private String source;
	
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
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}

	}	
	
}
