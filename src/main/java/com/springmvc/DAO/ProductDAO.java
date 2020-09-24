package com.springmvc.DAO;

import java.util.List;

import com.springmvc.entity.Product;

public interface ProductDAO {
	
	void addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct( long id);
	Product getProductById(long id);
	List<Product> getProductByName( String name);
	List<Product> getAllProduct();
	List<Product> getProductByObject(String object);
	List<Product> getProductByCategory(String category);
	List<Product> getProductByBrand(String brand);
}
