package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.OrderDetail;
import com.springmvc.model.OrderDetailDTO;

public interface OrderDetailService {
	OrderDetail convertToEntity( OrderDetailDTO orderDetailDTO);
	OrderDetailDTO convertToDTO( OrderDetail orderDetail);
	void addOrder(List<OrderDetailDTO> orderDetailDTOs);
	void delete(long id);
	OrderDetailDTO findById(long id);
}
