package com.springmvc.model;

public class ShippingDTO {
	private long id;
	private String shippingType;
	private double cost;
	
	public ShippingDTO() {
		super();
	}

	public ShippingDTO(long id, String shippingType, double cost) {
		super();
		this.id = id;
		this.shippingType = shippingType;
		this.cost = cost;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShippingType() {
		return shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
