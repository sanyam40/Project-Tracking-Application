package com.ncu.finalProjectMFW.entity;

import javax.validation.constraints.Email;

public class User {

	private String user_id;

	@Email
	private String email;
	private String password;
	private String user_type;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public User(String user_id, String email, String password, String user_type) {
		super();
		this.user_id = user_id;
		this.email = email;
		this.password = password;
		this.user_type = user_type;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + ", password=" + password + ", user_type=" + user_type
				+ "]";
	}

}
