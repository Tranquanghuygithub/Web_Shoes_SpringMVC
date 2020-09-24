package com.springmvc.service.impl;

import org.hibernate.SessionFactory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.CustomerDAO;
import com.springmvc.entity.Customer;
import com.springmvc.model.CustomerDTO;
import com.springmvc.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

	@Override      
	public CustomerDTO convertToDTO(Customer cus) {
		ModelMapper modelMapper= new ModelMapper();
		CustomerDTO cusDTO= modelMapper.map(cus, CustomerDTO.class);
		return cusDTO;
	}

	@Override
	public Customer convertToEntity(CustomerDTO cusDTO) {
		ModelMapper modelMapper= new ModelMapper();
		Customer cus= modelMapper.map(cusDTO, Customer.class);
		return cus;
	}
	@Override
	public CustomerDTO getCusByUsername(String username) {
		Customer  cus =customerDAO.getCusByUsername(username);
		return  convertToDTO(cus);
	}

	@Override
	public void addCustomer(CustomerDTO cusDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCus(CustomerDTO cusDTO) {
		
		 customerDAO.updateCus(convertToEntity(cusDTO));
		
	}

}
