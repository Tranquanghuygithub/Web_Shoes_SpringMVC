package com.springmvc.mapper;

import org.modelmapper.ModelMapper;

import com.springmvc.entity.AddressCheckout;
import com.springmvc.model.AddressCheckoutDTO;

public class AddressCheckoutMapper {
	
	public static AddressCheckoutDTO convertToDTO(AddressCheckout addressCheckout) {
		ModelMapper modelMapper = new ModelMapper();
		AddressCheckoutDTO addressCheckoutDTO= modelMapper.map(addressCheckout, AddressCheckoutDTO.class);
		return addressCheckoutDTO;
	}

	
	public static AddressCheckout convertToEntity(AddressCheckoutDTO addressCheckoutDTO) {
		ModelMapper modelMapper = new ModelMapper();
		AddressCheckout addressCheckout= modelMapper.map(addressCheckoutDTO, AddressCheckout.class);
		return addressCheckout;
	}
}
