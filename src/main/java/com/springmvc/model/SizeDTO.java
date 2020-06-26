package com.springmvc.model;

public class SizeDTO {
	private long id;
	private int number;
	
	
	public SizeDTO() {
		super();
	}
	
	public SizeDTO(long id, int number) {
		super();
		this.id = id;
		this.number = number;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
