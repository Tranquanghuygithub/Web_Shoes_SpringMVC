package com.springmvc.service;

import com.springmvc.entity.Order;
import com.springmvc.model.OrderDTO;

public interface OrderService {
	Order convertToEntity( OrderDTO orderDTO);
	OrderDTO convertToDTO( Order order);
	long addOrder(OrderDTO orderDTO);
	void delete(long id);
	OrderDTO findById(long id);
}
