package com.springmvc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the order database table.
 * 
 */
@Entity(name="orders")

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="tradetime")
	private Date tradeTime;


	@Column(name="status")
	private String status;
	
	@Column(name="totalprice")
	private double totalPrice;


	@ManyToOne
	@JoinColumn(name = "addressid", referencedColumnName = "id",nullable = false)
	private AddressCheckout addressCheckout;

//	
	@ManyToOne
	@JoinColumn(name="customer_username", referencedColumnName = "username", nullable = false)
	private Customer customer;

//	
	@Column(name="shippingid")
	private long shippingId;
	@ManyToOne
	@JoinColumn(name="manager_username", referencedColumnName = "username", nullable = true)
	private Manager manager;
	
//	@OneToMany(mappedBy = "order")
//	private List<OrderDetail> orderDetails;

	public Order() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
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

	public AddressCheckout getAddressCheckout() {
		return addressCheckout;
	}

	public void setAddressCheckout(AddressCheckout addressCheckout) {
		this.addressCheckout = addressCheckout;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getShippingId() {
		return shippingId;
	}

	public void setShippingId(long shippingId) {
		this.shippingId = shippingId;
	}

//	@Override
//	public String toString() {
//		return "Order [id=" + id + ", tradeTime=" + tradeTime + ", status=" + status + ", totalPrice=" + totalPrice
//				+ ", addressCheckout=" + addressCheckout + ", customer=" + customer + ", shippingId=" + shippingId
//				+ ", manager=" + manager + ", orderDetails=" + orderDetails + "]";
//	}
//
//	public List<OrderDetail> getOrderDetails() {
//		return orderDetails;
//	}
//
//	public void setOrderDetails(List<OrderDetail> orderDetails) {
//		this.orderDetails = orderDetails;
//	}


	

//	public Shipping getShipping() {
//		return shipping;
//	}
//
//	public void setShipping(Shipping shipping) {
//		this.shipping = shipping;
//	}
	
}