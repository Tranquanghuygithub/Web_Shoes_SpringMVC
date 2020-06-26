package com.springmvc.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the size database table.
 * 
 */
@Entity(name="specificsize")
@Table(name="specificsize")
public class SpecificSize implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="productId")
	private long productId;
	
	@Column(name="sizeid")
	private long sizeId;

	public SpecificSize() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getSizeId() {
		return sizeId;
	}

	public void setSizeId(long sizeId) {
		this.sizeId = sizeId;
	}



}