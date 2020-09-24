package com.springmvc.DAO;

import com.springmvc.entity.Order;

public interface OrderDAO {
	long addOrder(Order order);
	void delete(long id);
	Order findById(long id);

}
