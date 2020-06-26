package com.springmvc.model;

public class AccountDTO {
	private String username;
	private String password;
	private int role;
	private int disable;
	public AccountDTO() {
		super();
	}
	public AccountDTO(String username, String password, int role, int disable) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.disable=disable;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public int getDisable() {
		return disable;
	}
	public void setDisable(int disable) {
		this.disable = disable;
	}
	

}
