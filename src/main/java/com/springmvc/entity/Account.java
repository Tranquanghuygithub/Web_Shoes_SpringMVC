package com.springmvc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

;
/**
 * The persistent class for the account database table.
 * 
 */
@Entity(name = "account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "username")
	private String username;
	
	@Column(name="disable")
	private int disable;

	@Column(name="password")
	private String password;

	@Column(name="role")
	private int role;





	public Account() {
	}


	public int getDisable() {
		return this.disable;
	}

	public void setDisable(int disable) {
		this.disable = disable;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getRole() {
		return this.role;
	}

	public void setRole(int role) {
		this.role = role;
	}



	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}