package com.cos.dto;

public class MemberVO {
	private String id;
	private String password;
	private String username;
	private String email;
	private String salt;
	private boolean emailclick;
	
	public boolean isEmailclick() {
		return emailclick;
	}

	public void setEmailclick(boolean emailclick) {
		this.emailclick = emailclick;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
