package com.springmvc.mapper;

import java.util.ArrayList;
import java.util.List;

import com.springmvc.entity.Order;
import com.springmvc.entity.OrderDetail;
import com.springmvc.model.OrderDTO;
import com.springmvc.model.OrderDetailDTO;

public class OrderMapper {
	public static Order convertToEntity(OrderDTO orderDTO) {
		Order order= new Order();
		
		order.setTradeTime(orderDTO.getTradeTime());
		order.setStatus(orderDTO.getStatus());
		order.setTotalPrice(orderDTO.getTotalPrice());
		order.setAddressCheckout(AddressCheckoutMapper.convertToEntity(orderDTO.getAddressCheckout()));
		order.setCustomer(CustomerMapper.convertToEntity(orderDTO.getCustomer()));
	    order.setShippingId(orderDTO.getShippingId());
		//order.setManager(orderDTO.getManager());
		// set list OrrderDetails
		List<OrderDetail> listOrder= new ArrayList<OrderDetail>();
		
		for(OrderDetailDTO orderDetailDTO:orderDTO.getOrderDetails()) {
			OrderDetail orderDetail=OrderDetailMapper.convertToEntity(orderDetailDTO);
			listOrder.add(orderDetail);
		}
		
		
		return order;
	}

}
