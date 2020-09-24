package com.springmvc.service;

import com.springmvc.entity.Address;
import com.springmvc.model.AddressDTO;

public interface AddressService {
	AddressDTO convertToDTO(Address address);
	
	Address convertToEntity(AddressDTO addressDTO);
	
	void addAddress(AddressDTO address);
	AddressDTO getAddressById(long id);
	void updateAddress(AddressDTO address);
}
