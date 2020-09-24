package com.springmvc.service.impl;

import javax.xml.ws.soap.Addressing;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.AddressDAO;
import com.springmvc.entity.Address;
import com.springmvc.model.AccountDTO;
import com.springmvc.model.AddressDTO;
import com.springmvc.service.AddressService;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {
	
	   @Autowired
	   private AddressDAO addressDAO;
	   

	@Override
	public AddressDTO convertToDTO(Address address) {
		ModelMapper modelMapper = new ModelMapper();
		AddressDTO addressDTO =modelMapper.map(address, AddressDTO.class);
		return addressDTO;
	}

	@Override
	public Address convertToEntity(AddressDTO addressDTO) {
		ModelMapper modelMapper= new ModelMapper();
		Address address = modelMapper.map(addressDTO, Address.class);
		return address;
	}

	@Override
	public void addAddress(AddressDTO addressDTO) {
		addressDAO.addAddress(convertToEntity(addressDTO));
	}

	@Override
	public AddressDTO getAddressById(long id) {
		Address address= addressDAO.getAddressById(id);
		return convertToDTO(address);
	}

	@Override
	public void updateAddress(AddressDTO addressDTO) {
		Address address = convertToEntity(addressDTO);
		addressDAO.updateAddress(address);
		
	}



}
