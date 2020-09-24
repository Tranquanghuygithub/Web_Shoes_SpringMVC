package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.Shipping;
import com.springmvc.model.ShippingDTO;

public interface ShippingService {
	ShippingDTO convertToDTO(Shipping ship);
	Shipping convertToEntity(ShippingDTO shipDTO);
	List<ShippingDTO> getAllShipping();
	ShippingDTO getShippingById(long id);
}
