package com.springmvc.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the manager database table.
 * 
 */
@Entity(name="manager")

public class Manager implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="username")
	private String username;

	@Column(name="email")
	private String email;

	@Column(name="name")
	private String name;

	@Column(name="phone")
	private String phone;
	
	@Column(name="salary")
	private double salary;
    
	@OneToOne
	@JoinColumn(name="username")
	private Account account;
	public Manager() {
		
	}

	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getUsername() {
		return username;
	}





}