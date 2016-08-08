package org.khmerslide.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
	@JsonProperty("CAT_ID")
	private int cat_id;
	@JsonProperty("PARENT_ID")
	private int parent_id;
	@JsonProperty("CAT_NAME")
	private String cat_name;
	@JsonProperty("CREATED_DATE")
	private String created_date;
	@JsonProperty("STATUS")
	private int status;
	@JsonProperty("USER_ID")
	private int  user_id;
	@JsonProperty("DESCRIPTION")
	private String description;
	
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
