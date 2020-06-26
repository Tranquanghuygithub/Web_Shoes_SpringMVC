package com.springmvc.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oderdetail database table.
 * 
 */
@Entity(name="oderdetail")


public class OderDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="unitprice")
	private double unitprice;
	
	@Column(name="size")
	private int size;

//	@JoinColumn(name="orderid", nullable=false)
//	private Order order;

public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="productid", nullable=false)
//	private Product product;
	@Column(name="orderid")
	private long orderId;
	
	@Column(name="productid")
	private long productId;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public OderDetail() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

}