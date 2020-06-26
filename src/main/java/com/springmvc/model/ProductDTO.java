package com.springmvc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ProductDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;
	private String category;
	private String brand;
    private String object;
    private String color;
    private List<String> sizes= new ArrayList<String>();// muoons add dc du lieu vao list can khai bao new
    private String size;
    private double price;
    private int quantity;
    private String description;
      private String image;
    
    // upload file image
      private MultipartFile fileData;
 
    
	public ProductDTO() {
		super();
	}
	

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public ProductDTO(long id, String name, String category, String brand, String object, String color, int quantity,
			String size, double price, String description, String image, List<String> sizes) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.object = object;
		this.color = color;
		this.size = size;
		this.price = price;
		this.quantity= quantity;
		this.description = description;
		this.image = image;
		this.sizes=sizes;
	}



	public void setSize(String size) {
		this.size = size;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}

	public void setFileData(MultipartFile fileData) {
		this.fileData = fileData;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}



	public void setSize() {
		this.size="";
		for(String s:sizes) {
			this.size+=s+"-";
		}
	}



	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public MultipartFile getFileData() {
		return fileData;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public List<String> getSizes() {
		return sizes;
	}


	public void setToSizes() {
		this.size= this.size.trim();
		String []temp= this.size.split("[-]");
		for(String str:temp) {
			this.sizes.add(str);
		}
	}
	public void setSizes(List<String> sizes) {
		this.sizes = sizes;
	}


	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", category=" + category + ", brand=" + brand + ", object="
				+ object + ", color=" + color + ", sizes=" + sizes + ", size=" + size + ", price=" + price
				+ ", quantity=" + quantity + ", description=" + description + ", image=" + image + ", fileData="
				+ fileData + "]";
	}





}
