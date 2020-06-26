package com.springmvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.DAO.ProductDAO;
import com.springmvc.entity.Product;
import com.springmvc.model.ProductDTO;
import com.springmvc.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	  @Autowired
	  ProductDAO productDAO;
	

	@Override
	public ProductDTO covertToDTO(Product product) {
		// chu y co the chưa map dc voi cai image nha
		ModelMapper modelMapper= new ModelMapper();
		ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
	
		
//		productDTO.setId(product.getId());
//		productDTO.setName(product.getName());
//		productDTO.setBrand(product.getBrand());
//		productDTO.setCategory(product.getCategory());
//		productDTO.setColor(product.getColor());
//		productDTO.setObject(product.getObject());
//		productDTO.setPrice();
//		productDTO.setSize();
//		productDTO.setFileData(fileData);
		return productDTO;
		
	}

	@Override
	public Product convertToEntity(ProductDTO productDTO) {
		
		ModelMapper modelMapper= new ModelMapper();
		
		@SuppressWarnings("unused")
		Product product= modelMapper.map(productDTO, Product.class);
		return product;
	}

	@Override
	public void addProduct(ProductDTO productDTO) {
		// add san pham chu y hinh anh nha
		productDAO.addProduct(convertToEntity(productDTO));
		
	}

	@Override
	public void updateProduct(ProductDTO productDTO) {
		productDAO.updateProduct(convertToEntity(productDTO));
	}

	@Override
	public void deleteProduct(long id) {
		productDAO.deleteProduct(id);
		
	}

	@Override
	public ProductDTO getProductById(long id) {
		return covertToDTO(productDAO.getProductById(id));
	}

	@SuppressWarnings("null")
	@Override
	public List<ProductDTO> getProductByName(String name) {
		List<Product> list=productDAO.getProductByName(name);
		List<ProductDTO> result = null;
		for(Product p:list) {
			result.add(covertToDTO(p));
			
		}
		return result;
		
	}

	@SuppressWarnings("null")
	@Override
	public List<ProductDTO> getAllProduct() {
		List<Product> list=productDAO.getAllProduct();
		List<ProductDTO> result= new ArrayList<ProductDTO>();
		for(Product p:list) {
			result.add(covertToDTO(p));
		}
		return result;
	}

}
