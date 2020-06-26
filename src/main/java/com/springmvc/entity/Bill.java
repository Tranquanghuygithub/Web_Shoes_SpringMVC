package com.springmvc.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bill database table.
 * 
 */
@Entity(name="bill")
@Table(name="bill")
public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;

	@Column(name="paymentstate")
	private String paymentstate;

	@Column(name="paymenttype")
	private String paymenttype;

	@Column(name="orderid")
	private long orderId;

	public Bill() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPaymentstate() {
		return this.paymentstate;
	}

	public void setPaymentstate(String paymentstate) {
		this.paymentstate = paymentstate;
	}

	public String getPaymenttype() {
		return this.paymenttype;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

}