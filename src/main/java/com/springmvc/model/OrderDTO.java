package com.springmvc.model;

import java.util.Date;
import java.util.List;

public class OrderDTO {
	private long id;
	
	private String totalPrice;
	private Date tradeTime;
	private String status;
	private AddressCheckOutDTO address;
	private ShippingDTO shippingDTO;
	private  List<OrderDetailDTO> listDetail;
	
	public OrderDTO(long id, String totalPrice, Date tradeTime, String status, AddressCheckOutDTO address,
			ShippingDTO shippingDTO) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.tradeTime = tradeTime;
		this.status = status;
		this.address = address;
		this.shippingDTO = shippingDTO;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getTradeTime() {
		return tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public AddressCheckOutDTO getAddress() {
		return address;
	}
	public void setAddress(AddressCheckOutDTO address) {
		this.address = address;
	}
	public ShippingDTO getShippingDTO() {
		return shippingDTO;
	}
	public void setShippingDTO(ShippingDTO shippingDTO) {
		this.shippingDTO = shippingDTO;
	}
	public List<OrderDetailDTO> getListDetail() {
		return listDetail;
	}
	public void setListDetail(List<OrderDetailDTO> listDetail) {
		this.listDetail = listDetail;
	}
	
}
