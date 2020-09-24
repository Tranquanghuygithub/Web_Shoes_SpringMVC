package com.springmvc.model;

public class AddressCheckoutDTO {
	private long id;
	private String city;
	private String district;
	private String ward;
	private String description;
	private String name;
	private String phone;
	
	public AddressCheckoutDTO() {
		super();
	}
	

	public AddressCheckoutDTO(long id, String city, String district, String ward, String description, String name,
			String phone) {
		super();
		this.id = id;
		this.city = city;
		this.district = district;
		this.ward = ward;
		this.description = description;
		this.name = name;
		this.phone = phone;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
