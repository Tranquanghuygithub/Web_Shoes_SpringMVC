package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.ProductDTO;
import com.springmvc.service.ProductService;

@Controller
public class FilterController {
	
	@Autowired
	private ProductService productService;
	@GetMapping("/filter")
	public String getProductByObject(Model model, @RequestParam(name = "object") String object) {
		List<ProductDTO> listProduct= productService.getProductByObject(object);
		model.addAttribute("listProduct", listProduct);
		return "home";
	}
	@GetMapping("/search")
	public String getProductBySearch(Model model, @RequestParam(name="keyword") String keyword) {
		List<ProductDTO> listProduct;
		listProduct=productService.getProductByName(keyword);
		if(listProduct.size()==0) {
			listProduct=productService.getProductByBrand(keyword);
		}
		model.addAttribute("listProduct", listProduct);
		return "home";
	}
}
