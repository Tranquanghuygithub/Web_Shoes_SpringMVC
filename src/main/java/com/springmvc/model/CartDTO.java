package com.springmvc.model;

import java.util.ArrayList;
import java.util.List;

public class CartDTO {
	private List<ItemDTO> itemList;
	private double totalPrice;

	
	public CartDTO(List<ItemDTO> itemList, double totalPrice) {
		super();
		this.itemList = itemList;
		this.totalPrice = totalPrice;
	}

	public CartDTO(List<ItemDTO> itemList) {
		super();
		this.itemList = itemList;
	}

	public CartDTO() {
		super();
	}
	public List<ItemDTO> getItemList() {
		return itemList;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice() {
		this.totalPrice=0;
		for(ItemDTO item:itemList) {
			this.totalPrice +=item.getTotalPrice();
			
		}
	}
	public int  getQuantity() {
		int total=0;
		for(ItemDTO item:itemList) {
			total+=item.getQuantity();
		}
		return total;
	}

	public void setItemList(List<ItemDTO> itemList) {
		this.itemList = itemList;
	}
	
	
}
