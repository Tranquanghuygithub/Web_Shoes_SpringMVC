package com.springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.springmvc.model.AccountDTO;
import com.springmvc.model.AddressCheckoutDTO;
import com.springmvc.model.CartDTO;
import com.springmvc.model.CustomerDTO;
import com.springmvc.model.ItemDTO;
import com.springmvc.model.OrderDTO;
import com.springmvc.model.OrderDetailDTO;
import com.springmvc.model.ShippingDTO;
import com.springmvc.service.AddressCheckoutService;
import com.springmvc.service.CustomerService;
import com.springmvc.service.OrderDetailService;
import com.springmvc.service.OrderService;
import com.springmvc.service.ShippingService;
import com.springmvc.validator.OrderValidator;

@Controller
public class CheckoutController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private ShippingService shipService;
	@Autowired
	private AddressCheckoutService addressCheckoutService;
	@Autowired
	private OrderValidator orderValidator;
	@Autowired 
	private OrderService orderService;
	@Autowired OrderDetailService orderDetailService;
	@GetMapping("/checkout")
	public String getCheckout(@SessionAttribute(name = "account",required = false) AccountDTO account,HttpSession session, Model model) {
		if(account==null) {
			session.setAttribute("navigationMessage","toCheckout" );
			return "redirect:/login";
		}
		else {
			 AddressCheckoutDTO addressCheckoutDTO =addressCheckoutService.getLastRecord();
			 model.addAttribute("address", addressCheckoutDTO);
			 session.setAttribute("address", addressCheckoutDTO);
			 return "confirmAddress";
		}
				
	}
	@PostMapping("/changeAddress")
	public String changeAddress(@ModelAttribute(name="address") AddressCheckoutDTO addressInfor, HttpSession session) {
		long addressId= addressCheckoutService.addAddress(addressInfor);
		addressInfor.setId(addressId);
	 session.setAttribute("address", addressInfor);
		return "confirmAddress";
	}
	@GetMapping("/payment")
	public String payment(Model model, HttpServletRequest request, HttpSession session) {
		
		List<ShippingDTO> listShip= shipService.getAllShipping();
		Map<Integer,String> map=new HashMap<Integer,String>();
		Map<Integer, String> paymentMap= new HashMap<Integer, String>();
		
		for(ShippingDTO shippingDTO: listShip) {
			map.put((int) shippingDTO.getId(),shippingDTO.toString());
		}
		 // sử dụng session  cho map method shipping để khi load lại trang vẫn còn các phương thức( trường hợp validator)
	    session.setAttribute("map", map);
		model.addAttribute("order", new OrderDTO());
		return "payment";
	}
	@PostMapping("/order")
	public String order(Model model, @ModelAttribute(name = "order") OrderDTO orderDTO ,HttpSession session,BindingResult bindingResult) {
		orderValidator.validate(orderDTO, bindingResult);
		if(bindingResult.hasErrors()) {
			System.out.println("loi cua no la : "+ bindingResult.getFieldError());
			return "payment";
		}
		// set order
		orderDTO.setTradeTime(new java.sql.Date(System.currentTimeMillis()));
		ShippingDTO shipDTO= shipService.getShippingById(orderDTO.getShippingId());
		orderDTO.setShippingPrice(shipDTO.getCost());
		orderDTO.setStatus("Đã tiếp nhận");
		//setCustomer and set Address\
	     CustomerDTO cusDTO= (CustomerDTO) session.getAttribute("customer");
	     
		 orderDTO.setCustomer(cusDTO);
		// set ađress
		 AddressCheckoutDTO addressCheckoutDTO = (AddressCheckoutDTO) session.getAttribute("address");
		orderDTO.setAddressCheckout(addressCheckoutDTO);
		CartDTO cartDTO = (CartDTO) session.getAttribute("cartDTO");
		orderDTO.setTotalPrice(cartDTO.getTotalPrice()+orderDTO.getShippingPrice());
		
		long orderId=orderService.addOrder(orderDTO);
		
		// set Orderdetail
		List<ItemDTO> itemList= cartDTO.getItemList();
		List<OrderDetailDTO> orderDetails= new ArrayList<OrderDetailDTO>();
		for( ItemDTO item:itemList) {
			OrderDetailDTO orderDetailDTO= new OrderDetailDTO();
			orderDetailDTO.setQuantity(item.getQuantity());
			orderDetailDTO.setSize(item.getSize());
			orderDetailDTO.setUnitPrice(item.getUnitPrice());
			orderDetailDTO.setProductId(item.getId());
			orderDetailDTO.setOrderId(orderId);
			orderDetails.add(orderDetailDTO);
		}
		orderDTO.setOrderDetails(orderDetails);
		orderDetailService.addOrder(orderDetails);
		if(orderDTO.getPaymentType().equals("Thanh toán bằng Paypal")) {
			   double total=orderDTO.getTotalPrice()/23;
			   orderDTO.setUsd(total);
			   model.addAttribute("orderDTO", orderDTO);	
			   System.out.println(orderDTO.getUsd());
			   session.removeAttribute("cartDTO");
			   session.removeAttribute("quantity");
			   return "jsp/index";
		}	
		  model.addAttribute("orderDTO", orderDTO);
		  session.removeAttribute("cartDTO");
		  session.removeAttribute("quantity");
	return "success";
	}
}
