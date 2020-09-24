package com.springmvc.model;

public class AddressDTO {
	private long id;
	private String city;
	private String district;
	private String ward;
	private String description;
	public AddressDTO() {
		super();
	}
	
	public AddressDTO(long id, String city, String district, String ward, String description) {
		super();
		this.id = id;
		this.city = city;
		this.district = district;
		this.ward = ward;
		this.description = description;
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
	
	
}
