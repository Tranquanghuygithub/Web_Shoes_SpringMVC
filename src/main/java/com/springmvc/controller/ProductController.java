package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.ProductDTO;
import com.springmvc.service.ProductService;
import com.springmvc.validator.FileProcessUtils;
import com.springmvc.validator.ProductValidator;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@Autowired
	ProductValidator productValidator;

	@RequestMapping(value = "/admin/addProduct", method = RequestMethod.GET)
	public String addProduct( HttpServletRequest request) {
		// ko dung model đc trong trường hợp cần mapping dữ liệu vào modelAtribute
		ProductDTO productDTO = new ProductDTO();
		request.setAttribute("product", productDTO);
		return "admin/addProduct";
	}

	@RequestMapping(value = "/admin/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute(name="product") ProductDTO productDTO,
			BindingResult bindingResult ) {
		
		productValidator.validate(productDTO, bindingResult);
		if(bindingResult.hasErrors()) {
			System.out.println("loi cua no la : "+ bindingResult.getFieldError());
			return "admin/addProduct";
		}
				
		productDTO.setImage(FileProcessUtils.processUploadFile(productDTO.getFileData()));
		productDTO.setSize();// set Size
		System.out.println(productDTO.toString());
		System.out.println(productDTO.getCategory());
		productService.addProduct(productDTO);
		return "redirect:/admin/managerProduct";
	}
	
	@RequestMapping(value = "/admin/editProduct", method = RequestMethod.GET)
	public String editProduct( @RequestParam(name="id") long id, HttpServletRequest request, Model model) {		
		ProductDTO productDTO= productService.getProductById(id);
		//request.setAttribute("productDTO",productDTO);
		productDTO.setToSizes();
		model.addAttribute(productDTO);
		return "/admin/editProduct";
		
	}
	@RequestMapping(value = "/admin/editProduct", method = RequestMethod.POST)
	public String editProduct( @ModelAttribute(name = "productDTO") ProductDTO productDTO, BindingResult bindingResult) {
		productValidator.validate(productDTO, bindingResult);
		if(bindingResult.hasErrors()) {
			System.out.println("loi cua no la : "+ bindingResult.getFieldError());
			return "admin/editProduct";
		}
				
		productDTO.setImage(FileProcessUtils.processUploadFile(productDTO.getFileData()));
		productDTO.setSize();// set Size
		productService.updateProduct(productDTO);
		return "redirect:/admin/managerProduct";
	}

	@RequestMapping(value = "/admin/deleteProduct", method = RequestMethod.GET)
	public String deleteProduct(@RequestParam(name = "id") long id) {
		productService.deleteProduct(id);
		return "redirect:/admin/managerProduct";
	}

	
}
