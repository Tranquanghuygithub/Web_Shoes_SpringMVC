package com.springmvc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.ProductDTO;
import com.springmvc.service.ProductService;


@Controller
public class AdminController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/admin/managerProduct", method = RequestMethod.GET)
	public String getAllProduct(Model model) {
		ArrayList<ProductDTO> listProduct= (ArrayList<ProductDTO>) productService.getAllProduct();
		model.addAttribute("listProduct", listProduct);
		return "admin/manager";
	}
	
	
}
