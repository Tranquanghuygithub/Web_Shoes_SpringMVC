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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;

	@Column(name="email")
	private String email;

	@Column(name="name")
	private String name;

	@Column(name="phone")
	private String phone;
	
	@Column(name="salary")
	private double salary;

//	@JoinColumn(name="accountid")
//	private Account account;
	@Column(name="username")
	private long username;

	public Manager() {
		
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public long getUsername() {
		return username;
	}

	public void setUsername(long username) {
		this.username = username;
	}




}