package com.springmvc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


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

	
	@OneToOne
	@JoinColumn(name = "orderid",unique=true)
	private Order order;

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

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

}