package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.DAO.AddressCheckoutDAO;
import com.springmvc.DAO.impl.AddressDAOImpl;
import com.springmvc.entity.AddressCheckout;
import com.springmvc.entity.Customer;
import com.springmvc.entity.Order;
import com.springmvc.model.AddressCheckoutDTO;
import com.springmvc.model.AddressDTO;
import com.springmvc.model.CartDTO;
import com.springmvc.model.CustomerDTO;
import com.springmvc.model.ItemDTO;
import com.springmvc.model.OrderDTO;
import com.springmvc.model.OrderDetailDTO;
import com.springmvc.model.ProductDTO;
import com.springmvc.model.ShippingDTO;
import com.springmvc.service.AddressCheckoutService;
import com.springmvc.service.AddressService;
import com.springmvc.service.CustomerService;
import com.springmvc.service.OrderService;
import com.springmvc.service.ProductService;
import com.springmvc.service.ShippingService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	ProductService productService;
	@Autowired 
	AddressService addressService;
	@Autowired 
	CustomerService customerService;
	@Autowired
	ShippingService shipService;
	@Autowired
	AddressCheckoutService add;
	@Autowired
	OrderService orderService;
	
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
	@GetMapping("/address")
	public AddressDTO getAddress() {
		return addressService.getAddressById(1);
	}
	@GetMapping("/customer")
	public CustomerDTO getCus() {
		return  customerService.getCusByUsername("dotan");
	}
	@GetMapping("/shipping")
	public ShippingDTO getShip() {
		return shipService.getShippingById(1);
	}
	@GetMapping("/add")
	
	public List<OrderDetailDTO> add( HttpSession session) {
		CartDTO cart= (CartDTO) session.getAttribute("cart");
		List<ItemDTO> itemList= cart.getItemList();
		List<OrderDetailDTO> orderDetailList= new ArrayList<OrderDetailDTO>();
		for( ItemDTO item:itemList) {
			OrderDetailDTO orderDetailDTO= new OrderDetailDTO();
			orderDetailDTO.setQuantity(item.getQuantity());
			orderDetailDTO.setSize(item.getSize());
			orderDetailDTO.setUnitPrice(item.getUnitPrice());
			//orderDetailDTO.setProduct(item.getProductDTO());
			orderDetailDTO.setProductId(item.getId());
			// thieu set idOrder
			orderDetailList.add(orderDetailDTO);
		}
		return orderDetailList;
	}
	@GetMapping("/showorder")
    public OrderDTO showOrder(HttpSession session) {
    	OrderDTO orderDTO =(OrderDTO)session.getAttribute("order");
    	return orderDTO;
    }
}
