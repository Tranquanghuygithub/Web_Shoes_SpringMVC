package com.springmvc.model;

public class OrderDetailDTO {
	private long id;
	private int quantity;
	private int size;
	private double unitPrice;
	
	private long productId;
	private long orderId;
	
	
//	private OrderDTO orderDTO;
	//private ProductDTO product;
	
	public OrderDetailDTO() {
		super();
	}

	public OrderDetailDTO(long id, int quantity, int size, double unitPrice, long productId, long orderId) {
	super();
	this.id = id;
	this.quantity = quantity;
	this.size = size;
	this.unitPrice = unitPrice;
	this.productId = productId;
	this.orderId = orderId;
}

	// ham nay để chuyên từ DTO->Entity
	public OrderDetailDTO(long id, long productId, long orderId, int quantity, int size, double unitPrice) {
		super();
		this.id = id;
		this.setProductId(productId);
		this.setOrderId(orderId);
		this.quantity = quantity;
		this.size = size;
		this.unitPrice = unitPrice;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	
	
}
