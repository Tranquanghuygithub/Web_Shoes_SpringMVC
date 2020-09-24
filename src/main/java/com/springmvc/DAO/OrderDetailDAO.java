package com.springmvc.DAO;

import java.util.List;

import com.springmvc.entity.OrderDetail;

public interface OrderDetailDAO {
	void addOrder(List<OrderDetail> oderDetails);
	void delete(long id);
	OrderDetail findById(long id);

}
