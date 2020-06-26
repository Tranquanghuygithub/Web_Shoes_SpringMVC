package com.springmvc.entity;

import java.io.Serializable;

import javax.persistence.*;
@Entity(name="product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;

	@Column(name="brand")
	private String brand;

	@Column(name="color")
	private String color;

	@Column(name="description")
	private String description;

	@Column(name="image")
	private String image;

	@Column(name="name")
	private String name;

	@Column(name="category")
	private String category;

	@Column(name="object")
	private String object;

	@Column(name="price")
	private double price;

	@Column(name="quantity")
	private int quantity;
	
	@Column(name="size")
	private String size;
	
//
//	@OneToMany(mappedBy="product")
//	private List<Oderdetail> oderdetails;

	//bi-directional many-to-one association to Size
//	@OneToMany(mappedBy="product")
//	private List<Size> sizes;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Product() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}




	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getObject() {
		return this.object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

//	public List<Oderdetail> getOderdetails() {
//		return this.oderdetails;
//	}
//
//	public void setOderdetails(List<Oderdetail> oderdetails) {
//		this.oderdetails = oderdetails;
//	}



}