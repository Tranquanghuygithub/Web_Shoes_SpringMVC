package com.springmvc.DAO;

import java.util.List;

import com.springmvc.entity.Shipping;

public interface ShippingDAO {
	List<Shipping> getAllShipping();
	Shipping getShippingById(long id);
}
