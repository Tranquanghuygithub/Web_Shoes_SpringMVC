package com.springmvc.mapper;

import com.springmvc.entity.OrderDetail;
import com.springmvc.model.OrderDetailDTO;

public class OrderDetailMapper {
	public static OrderDetail convertToEntity(OrderDetailDTO orderDetailDTO) {
		OrderDetail orderDetail= new OrderDetail();
		orderDetail.setId(orderDetailDTO.getId());
		orderDetail.setQuantity(orderDetailDTO.getQuantity());
		orderDetail.setUnitprice(orderDetailDTO.getUnitPrice());
		orderDetail.setSize(orderDetailDTO.getSize());
		
		return orderDetail;
	}

}
