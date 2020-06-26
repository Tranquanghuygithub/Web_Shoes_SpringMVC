package com.springmvc.model;

public class OrderDetailDTO {
	private long id;
	private long productId;
	private long orderId;
	private int quantity;
	private int size;
	private double unitPrice;
	
	private ProductDTO productDTO;
	public OrderDetailDTO(long id, ProductDTO productDTO, int quantity, double unitPrice, int size) {
		super();
		this.id = id;
		this.productDTO = productDTO;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.setSize(size);
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
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
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
