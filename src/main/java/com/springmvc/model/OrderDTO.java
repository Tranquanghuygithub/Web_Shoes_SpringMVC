package com.springmvc.model;

import java.util.Date;
import java.util.List;

public class OrderDTO {
	private long id;
	
	private double totalPrice;//
	private double usd;
	private Date tradeTime;//
	private String status;//
	private String paymentType;//
	private long shippingId;//
	
	private double shippingPrice;//
	
	//private ShippingDTO shipping;//
	
	private CustomerDTO customer;
	private AddressCheckoutDTO addressCheckout;
	private ManagerDTO manager;

	
	
	private  List<OrderDetailDTO> orderDetails;
	
	public OrderDTO() {
		super();
	}
	public OrderDTO(long id, double totalPrice, Date tradeTime, String status, AddressDTO address,
			ShippingDTO shipping, double shippingPrice) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.tradeTime = tradeTime;
		this.status = status;
		//this.shipping = shipping;
		
		this.shippingPrice=shippingPrice;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
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
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public long getShippingId() {
		return shippingId;
	}
	public void setShippingId(long shippingId) {
		this.shippingId = shippingId;
	}
	public double getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(double shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
//	public ShippingDTO getShipping() {
//		return shipping;
//	}
//	public void setShipping(ShippingDTO shipping) {
//		this.shipping = shipping;
//	}
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	public AddressCheckoutDTO getAddressCheckout() {
		return addressCheckout;
	}
	public void setAddressCheckout(AddressCheckoutDTO addressCheckout) {
		this.addressCheckout = addressCheckout;
	}
	public ManagerDTO getManager() {
		return manager;
	}
	public void setManager(ManagerDTO manager) {
		this.manager = manager;
	}
	public List<OrderDetailDTO> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetailDTO> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public double getUsd() {
		return usd;
	}
	public void setUsd(double usd) {
		this.usd = usd;
	}


	
	
}
