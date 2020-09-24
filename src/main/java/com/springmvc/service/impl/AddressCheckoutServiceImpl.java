package com.springmvc.service.impl;

import org.hibernate.SessionFactory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.AddressCheckoutDAO;
import com.springmvc.entity.AddressCheckout;
import com.springmvc.model.AddressCheckoutDTO;
import com.springmvc.service.AddressCheckoutService;

@Service
@Transactional
public class AddressCheckoutServiceImpl implements AddressCheckoutService {
	@Autowired
	private AddressCheckoutDAO addressDAO;

	@Override
	public AddressCheckoutDTO convertToDTO(AddressCheckout addressCheckout) {
		ModelMapper modelMapper = new ModelMapper();
		AddressCheckoutDTO addressCheckoutDTO= modelMapper.map(addressCheckout, AddressCheckoutDTO.class);
		return addressCheckoutDTO;
	}

	@Override
	public AddressCheckout convertToEntity(AddressCheckoutDTO addressCheckoutDTO) {
		ModelMapper modelMapper = new ModelMapper();
		AddressCheckout addressCheckout= modelMapper.map(addressCheckoutDTO, AddressCheckout.class);
		return addressCheckout;
	}

	@Override
	public long addAddress(AddressCheckoutDTO addressCheckoutDTO) {
		return addressDAO.addAddressCheckout(convertToEntity(addressCheckoutDTO));
	}

	@Override
	public AddressCheckoutDTO getAddressById(long id) {
		return convertToDTO(addressDAO.getAddressById(id));
	}

	@Override
	public void updateAddress(AddressCheckoutDTO address) {
		addressDAO.updateAddressCheckout(convertToEntity(address));
		
	}

	@Override
	public AddressCheckoutDTO getLastRecord() {
		return convertToDTO(addressDAO.getLastRecord());
	}

}
