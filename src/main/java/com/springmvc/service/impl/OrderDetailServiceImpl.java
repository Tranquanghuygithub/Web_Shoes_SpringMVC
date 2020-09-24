package com.springmvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.OrderDetailDAO;
import com.springmvc.entity.OrderDetail;
import com.springmvc.model.OrderDetailDTO;
import com.springmvc.service.OrderDetailService;

@Service
@Transactional
public class OrderDetailServiceImpl implements OrderDetailService {
	@Autowired
	private OrderDetailDAO orderDAO;
	public  OrderDetail convertToEntity(OrderDetailDTO orderDetailDTO) {
		ModelMapper modelMapper = new ModelMapper();
		OrderDetail orderDetail= modelMapper.map(orderDetailDTO, OrderDetail.class);
		return orderDetail;
	}

	@Override
	public OrderDetailDTO convertToDTO(OrderDetail orderDetail) {
		ModelMapper modelMapper = new ModelMapper();
		OrderDetailDTO orderDetailDTO= modelMapper.map(orderDetail, OrderDetailDTO.class);
		return orderDetailDTO;
	}

	@Override
	public void addOrder(List<OrderDetailDTO> orderDetailDTOs) {
		
		List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
		for(OrderDetailDTO orderDetailDTO:orderDetailDTOs)
		{
			orderDetails.add(convertToEntity(orderDetailDTO));
		}
		 orderDAO.addOrder(orderDetails);
	}

	@Override
	public void delete(long id) {
		orderDAO.delete(id);
		
	}

	@Override
	public OrderDetailDTO findById(long id) {
		return convertToDTO(orderDAO.findById(id));
	}

}
