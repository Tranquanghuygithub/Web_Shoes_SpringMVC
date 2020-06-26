package com.springmvc.model;

public class BillDTO {
	private long id;
	private OrderDTO orderDTO;
	private String paymentType;
	private String paymentState;
	public BillDTO() {
		super();
	}
	public BillDTO(long id, OrderDTO orderDTO, String paymentType, String paymentState) {
		super();
		this.id = id;
		this.orderDTO = orderDTO;
		this.paymentType = paymentType;
		this.paymentState = paymentState;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public OrderDTO getOrderDTO() {
		return orderDTO;
	}
	public void setOrderDTO(OrderDTO orderDTO) {
		this.orderDTO = orderDTO;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentState() {
		return paymentState;
	}
	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}
	
	
}
