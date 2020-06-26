package com.springmvc.model;


public class LineItemDTO {
	private ProductDTO productDTO;
	private int quantity;
	private double price;
	private int size;
	  
	
	public LineItemDTO(ProductDTO productDTO, int quantity, double price, int size) {
		super();
		this.productDTO = productDTO;
		this.quantity = quantity;
		this.price = price;
		this.size = size;
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
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
