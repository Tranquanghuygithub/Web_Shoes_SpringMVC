package com.springmvc.service;

import java.util.List;

import com.springmvc.entity.Product;
import com.springmvc.model.ProductDTO;

public interface ProductService {
	
	ProductDTO covertToDTO( Product product);
	Product convertToEntity(ProductDTO productDTO);
	
	void addProduct(ProductDTO productDTO);
	void updateProduct(ProductDTO productDTO);
	void deleteProduct( long id);
	ProductDTO getProductById(long id);
	List<ProductDTO> getProductByName( String name);
	List<ProductDTO> getAllProduct();
	List<ProductDTO> getProductByObject(String object);
	List<ProductDTO> getProductByCategory(String category);
	List<ProductDTO> getProductByBrand(String brand);
}
