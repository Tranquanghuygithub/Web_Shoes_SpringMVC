package com.springmvc.model;

import java.io.Serializable;
import java.util.List;

public class ItemDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;//id product
	private ProductDTO productDTO;
	private int quantity;
	private double unitPrice;
	private int size;
	private String tmp;
	public ItemDTO() {
		super();
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public ItemDTO(long id, ProductDTO productDTO, int quantity, double unitPrice, int size) {
		super();
		this.id = id;
		this.productDTO = productDTO;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.size = size;
	}
	


	public ItemDTO(long id, ProductDTO productDTO, int quantity, double unitPrice, int size, String tmp) {
		super();
		this.id = id;
		this.productDTO = productDTO;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.size = Integer.valueOf(tmp);
		this.tmp = tmp;
	}


	public ProductDTO getProductDTO() {
		return productDTO;
	}


	public String getName() {
		return productDTO.getName();
	}


	public String getCategory() {
		return productDTO.getCategory();
	}


	public String getBrand() {
		return productDTO.getBrand();
	}


	public String getColor() {
		return productDTO.getColor();
	}


	public String getImage() {
		return productDTO.getImage();
	}


	public List<String> getSizes() {
		return productDTO.getSizes();
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

	public double getTotalPrice() {
		return (double)(this.unitPrice*this.quantity);
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


	public String getTmp() {
		return tmp;
	}


	public void setTmp(String tmp) {
		this.tmp = tmp;
	}



 }
