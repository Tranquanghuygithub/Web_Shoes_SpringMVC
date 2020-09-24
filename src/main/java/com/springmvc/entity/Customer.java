package com.springmvc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



/**
 * The persistent class for the customer database table.
 * 
 */
@Entity(name="customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="username")
	private String username;

	@Column(name="email")
	private String email;

	@Column(name="name")
	private String name;

	@Column(name="phone")
	private String phone;
    
	
	@OneToOne
	@JoinColumn(name="username",referencedColumnName ="username", nullable = false)
	private Account account;

	// chú ý cái đia chi này: VÌ trong CSDL để addressid là unique: cơ mà quan hệ thấy vẫn ghi là 1-n
	@OneToOne
	@JoinColumn(name="addressid",unique = true, referencedColumnName = "id", nullable = false)
	private Address address;


	public Customer() {
	}



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
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


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}




}