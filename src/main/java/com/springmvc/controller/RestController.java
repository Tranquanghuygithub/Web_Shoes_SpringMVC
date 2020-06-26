package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.ProductDTO;
import com.springmvc.service.ProductService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	ProductService productService;

	
//	@RequestMapping(value="/danh-sach")
//	public  List<UserDTO> getListUser(){
//		List<UserDTO> list= userService.getAllUsers();
//		return list;	
//	}
//	// guwir thong bao tra ve cua http laf 201: da tao than cong
//	@ResponseStatus(code=HttpStatus.CREATED)
	
	
	@RequestMapping(value="/add-product", method= RequestMethod.POST)
	public   void  themSp(@RequestBody ProductDTO productDTO) {
		productService.convertToEntity(productDTO);
		//return "redirect:/list-user";
	}
	
}
