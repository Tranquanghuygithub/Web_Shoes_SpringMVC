package com.springmvc.model;

public class AddressCheckOutDTO {
	private long id;
	private String city;
	private String district;
	private String ward;
	private String desciption;
	public AddressCheckOutDTO() {
		super();
	}
	public AddressCheckOutDTO(long id, String city, String district, String ward, String desciption) {
		super();
		this.id = id;
		this.city = city;
		this.district = district;
		this.ward = ward;
		this.desciption = desciption;
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
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	
	
}
