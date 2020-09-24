package com.springmvc.DAO;

import com.springmvc.entity.Customer;

public interface CustomerDAO {
	Customer getCusByUsername(String username);
	void  addCustomer(Customer cus);
	void updateCus(Customer cus);
	
}