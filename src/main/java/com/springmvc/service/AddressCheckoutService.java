package com.springmvc.service;

import com.springmvc.entity.AddressCheckout;
import com.springmvc.model.AddressCheckoutDTO;

public interface AddressCheckoutService {
	AddressCheckoutDTO convertToDTO(AddressCheckout addressCheckout );
	AddressCheckout convertToEntity(AddressCheckoutDTO addressCheckoutDTO );
	long addAddress(AddressCheckoutDTO addressCheckoutDTO);
	AddressCheckoutDTO getAddressById(long id);
	void updateAddress(AddressCheckoutDTO address);
	AddressCheckoutDTO getLastRecord();
}
