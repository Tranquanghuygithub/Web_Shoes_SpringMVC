package com.springmvc.mapper;

import org.modelmapper.ModelMapper;

import com.springmvc.entity.Shipping;
import com.springmvc.model.ShippingDTO;

public class ShippingMapper {

	public  static ShippingDTO convertToDTO(Shipping ship) {
		ModelMapper modelMapper = new ModelMapper();
		ShippingDTO shipDTO =modelMapper.map(ship, ShippingDTO.class);
		
		return shipDTO;
	}

	public static  Shipping convertToEntity(ShippingDTO shipDTO) {
		ModelMapper modelMapper = new ModelMapper();
		Shipping ship =modelMapper.map(shipDTO, Shipping.class);
		
		return ship;
	}
}
