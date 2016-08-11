package org.khmerslide.model;



import java.beans.Encoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.khmerslide.passwordencoder.PasswordEncoderGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InputUser {
	@JsonProperty("USER_NAME")
	private String user_name;
	@JsonProperty("GENDER")
	private String gender;
	@JsonProperty("EMAIL")
	private String email;
	@JsonProperty("PASSWORD")
	private String password;
	@JsonProperty("PHOTO")
	private String photo;
	@JsonProperty("DESCRIPTION")
	private String description;
	@JsonProperty("STATUS")
	private int status;
	@JsonProperty("ROLE")
	private int role;
	
	public static class InsertUser extends InputUser{
		@JsonProperty("REGISTERED_DATE")
		private String registered_date;

		public String getRegistered_date() {
			return registered_date;
		}

		public void setRegistered_date(String registered_date) {
			this.registered_date = registered_date;
		}
		
	}
	
	public static class UpdateUser extends InputUser{
		@JsonProperty("USER_NAME")
		private String user_name;
		@JsonProperty("GENDER")
		private String gender;
		@JsonProperty("EMAIL")
		private String email;
		@JsonProperty("PASSWORD")
		private String password;
		@JsonProperty("PHOTO")
		private String photo;
		@JsonProperty("DESCRIPTION")
		private String description;
		@JsonProperty("STATUS")
		private int status;
		@JsonProperty("ROLE_ID")
		private int role;
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			Base64.Encoder encoder = Base64.getEncoder();
			String encodedString = encoder.encodeToString(password.getBytes(StandardCharsets.UTF_8) );
			System.out.println(encodedString);
			
			/*	PasswordEncoderGenerator  p = new PasswordEncoderGenerator();
				p.EncoderPassword(password);*/
				this.password= encodedString;
		}
		public String getPhoto() {
			return photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
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
		public int getRole() {
			return role;
		}
		public void setRole(int role) {
			this.role = role;
		}
		
	}

	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
}
