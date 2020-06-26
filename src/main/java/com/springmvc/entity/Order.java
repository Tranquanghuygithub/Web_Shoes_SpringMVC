package com.springmvc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the order database table.
 * 
 */
@Entity(name="order")

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="date")
	private Date date;


	@Column(name="customerid")
	private int customerId;

	@Column(name="quantity")
	private int quantity;

	@Column(name="status")
	private String status;
	
	@Column(name="totalprice")
	private double totalPrice;

//	@JoinColumn(name="addresscheckoutid", nullable=false)
//	private Addresscheckout addresscheckout;
	
	@Column(name="addresscheckoutid")
	private long addressCheckoutId;

//	
//	@JoinColumn(name="customerid")
//	private Customer customer;
	

//	@JoinColumn(name="shippingid", nullable=false)
//	private Shipping shipping;
	@Column(name="shippingid")
	private long shippingId;

	public Order() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public long getAddressCheckoutId() {
		return addressCheckoutId;
	}

	public void setAddressCheckoutId(long addressCheckoutId) {
		this.addressCheckoutId = addressCheckoutId;
	}

	public long getShippingId() {
		return shippingId;
	}

	public void setShippingId(long shippingId) {
		this.shippingId = shippingId;
	}
}