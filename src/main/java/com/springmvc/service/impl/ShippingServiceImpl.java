package com.springmvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.ShippingDAO;
import com.springmvc.entity.Shipping;
import com.springmvc.model.ShippingDTO;
import com.springmvc.service.ShippingService;

@Service
@Transactional
public class ShippingServiceImpl implements ShippingService{
	
	@Autowired
	private ShippingDAO shipDAO;

	@Override
	public ShippingDTO convertToDTO(Shipping ship) {
		ModelMapper modelMapper = new ModelMapper();
		ShippingDTO shipDTO =modelMapper.map(ship, ShippingDTO.class);
		
		return shipDTO;
	}

	@Override
	public Shipping convertToEntity(ShippingDTO shipDTO) {
		ModelMapper modelMapper = new ModelMapper();
		Shipping ship =modelMapper.map(shipDTO, Shipping.class);
		
		return ship;
	}

	@Override
	public List<ShippingDTO> getAllShipping() {
		@SuppressWarnings("unused")
		List<Shipping> list= shipDAO.getAllShipping();
		List<ShippingDTO> listDTO= new ArrayList<ShippingDTO>();
		for(Shipping ship:list) {
			listDTO.add(convertToDTO(ship));
		}
		return listDTO;
	}

	@Override
	public ShippingDTO getShippingById(long id) {
		Shipping shipping= shipDAO.getShippingById(id);
		return convertToDTO(shipping);
	}

}
