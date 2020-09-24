package com.springmvc.model;

public class ManagerDTO {
	private String username;
	private String fullName;
	private String phone;
	private String email;
	private double salary;
	
	private AccountDTO account;
	
	
	public ManagerDTO(String username,String fullName, String phone, String email, double salary) {
		super();
		this.username = username;
		this.fullName = fullName;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
	}
	


	public AccountDTO getAccount() {
		return account;
	}



	public void setAccount(AccountDTO account) {
		this.account = account;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
