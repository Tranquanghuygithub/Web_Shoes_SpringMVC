package com.springmvc.service;

import com.springmvc.entity.Customer;
import com.springmvc.model.CustomerDTO;

public interface CustomerService {
	
	CustomerDTO convertToDTO( Customer cus);
	Customer convertToEntity(CustomerDTO cusDTO);
	CustomerDTO getCusByUsername(String username);
	void  addCustomer(CustomerDTO cusDTO);
	void updateCus(CustomerDTO cusDTO);
}
