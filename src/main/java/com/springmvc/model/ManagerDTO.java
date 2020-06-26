package com.springmvc.model;

public class ManagerDTO {
	private long id;
	private long accountId;
	private String fullName;
	private String phone;
	private String email;
	private double salary;
	
	
	public ManagerDTO(long id, long accountId, String fullName, String phone, String email, double salary) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.fullName = fullName;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
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
