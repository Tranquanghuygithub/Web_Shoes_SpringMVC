package com.springmvc.DAO;

import com.springmvc.entity.AddressCheckout;

public interface AddressCheckoutDAO {
	long addAddressCheckout(AddressCheckout address);
	AddressCheckout getAddressById(long id);
	void updateAddressCheckout(AddressCheckout address);
	AddressCheckout getLastRecord();
}
