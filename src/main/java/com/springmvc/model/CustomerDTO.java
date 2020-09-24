package com.springmvc.model;

public class CustomerDTO {
	private String username;
	private String name;
	private String phone;
	private String email;
	
	private AddressDTO  address;
	private AccountDTO  account;
	public CustomerDTO() {
		super();
	}
	public CustomerDTO(String username, String name, String phone, String email) {
		super();
		this.username = username;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	public AccountDTO getAccount() {
		return account;
	}
	public void setAccount(AccountDTO account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
