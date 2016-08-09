package org.khmerslide.model;

import org.khmerslide.entities.User;
import org.khmerslide.entities.User_Type;

import com.fasterxml.jackson.annotation.JsonProperty;


public class InputCategory {
	//Ido
/*	private int cat_id;*/
	@JsonProperty("PARENT")
	private int parent_id;
	@JsonProperty("CAT_NAME")
	private String cat_name;
	@JsonProperty("STATUS")
	private int status;
	@JsonProperty("USER")
	private int  user_id;
	@JsonProperty("DESCRIPTION")
	private String description;
	@JsonProperty("ICON")
	private String icon;
	
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	public static class InsertCategory extends InputCategory{
		private String created_date;
		public String getCreated_date() {
			return created_date;
		}
		public void setCreated_date(String created_date) {
			this.created_date = created_date;
		}
	}

	public static class UpdateCategory {
		private int parent_id;
		private String cat_name;
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
	}
}
