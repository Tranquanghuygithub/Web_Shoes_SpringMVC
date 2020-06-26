package com.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.ItemDTO;
import com.springmvc.model.ProductDTO;
import com.springmvc.service.ProductService;

@Controller
public class HomeController {
	@Autowired ProductService productService;
	
	@RequestMapping(value = "/home", method =RequestMethod.GET)
		public String home(HttpServletRequest request, Model model) {
			List<ProductDTO> listProduct= productService.getAllProduct();
			
//			request.setAttribute("listProduct", listProduct);
			model.addAttribute("listProduct", listProduct);
			return "home";
			
		}
	@RequestMapping( value="/detailProduct", method = RequestMethod.GET)
	public String detailProduct(Model model, @RequestParam(name="id") long id) {
		ProductDTO productDTO = productService.getProductById(id);
		productDTO.setToSizes();
		ItemDTO itemDTO = new ItemDTO();
		itemDTO.setProductDTO(productDTO);
		itemDTO.setUnitPrice(productDTO.getPrice());
		itemDTO.setQuantity(1);
		itemDTO.setId(productDTO.getId());
		
		model.addAttribute("itemDTO", itemDTO);
		return "detailProduct";
	}
//	@RequestMapping(value = "/home", method =RequestMethod.GET)
//	public String home( Model model ) {
//		List<ProductDTO> listProduct= productService.getAllProduct();
//		
//		model.addAttribute("listProduc", listProduct);
//		return "home";
//		
//	}

}
