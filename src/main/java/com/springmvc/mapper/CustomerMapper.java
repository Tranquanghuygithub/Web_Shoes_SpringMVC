package com.springmvc.mapper;

import org.modelmapper.ModelMapper;

import com.springmvc.entity.Customer;
import com.springmvc.model.CustomerDTO;

public class CustomerMapper {
     
	public  static CustomerDTO convertToDTO(Customer cus) {
		ModelMapper modelMapper= new ModelMapper();
		CustomerDTO cusDTO= modelMapper.map(cus, CustomerDTO.class);
		return cusDTO;
	}

	public static Customer convertToEntity(CustomerDTO cusDTO) {
		ModelMapper modelMapper= new ModelMapper();
		Customer cus= modelMapper.map(cusDTO, Customer.class);
		return cus;
	}
}
