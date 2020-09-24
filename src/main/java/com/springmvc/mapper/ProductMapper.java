package com.springmvc.mapper;

import org.modelmapper.ModelMapper;

import com.springmvc.entity.Product;
import com.springmvc.model.ProductDTO;

public class ProductMapper {
	public static ProductDTO covertToDTO(Product product) {
		// chu y co the chưa map dc voi cai image nha
		ModelMapper modelMapper= new ModelMapper();
		ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
		return productDTO;
		
	}

	public static Product convertToEntity(ProductDTO productDTO) {
		
		ModelMapper modelMapper= new ModelMapper();
		
		@SuppressWarnings("unused")
		Product product= modelMapper.map(productDTO, Product.class);
		return product;
	}
}
