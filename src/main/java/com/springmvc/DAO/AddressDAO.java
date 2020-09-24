package com.springmvc.DAO;

import com.springmvc.entity.Address;

public interface AddressDAO {
	void addAddress(Address address);
	Address getAddressById(long id);
	void updateAddress(Address address);
}
