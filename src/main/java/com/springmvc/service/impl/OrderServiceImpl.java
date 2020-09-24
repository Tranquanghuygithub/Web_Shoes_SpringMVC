package com.springmvc.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.OrderDAO;
import com.springmvc.entity.OrderDetail;
import com.springmvc.entity.Order;
import com.springmvc.model.OrderDTO;
import com.springmvc.model.OrderDetailDTO;
import com.springmvc.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDAO orderDAO;
	@Override
	public Order convertToEntity(OrderDTO orderDTO) {
		ModelMapper modelMapper = new ModelMapper();
		Order order= modelMapper.map(orderDTO, Order.class);
		List<OrderDetailDTO> orderDetailDTOs =orderDTO.getOrderDetails();
		System.out.println(order);
		return order;
	}

	@Override
	public OrderDTO convertToDTO(Order order) {
		ModelMapper modelMapper = new ModelMapper();
		OrderDTO orderDTO= modelMapper.map(order, OrderDTO.class);
		return orderDTO;
	}

	@Override
	public long addOrder(OrderDTO orderDTO) {
		return orderDAO.addOrder(convertToEntity(orderDTO));
	}

	@Override
	public void delete(long id) {
		orderDAO.delete(id);
		
	}

	@Override
	public OrderDTO findById(long id) {
		return convertToDTO(orderDAO.findById(id));
	}

}
