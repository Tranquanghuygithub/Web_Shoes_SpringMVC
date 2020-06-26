package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springmvc.model.AccountDTO;

@Controller
@SessionAttributes("navigationMessage")
public class CheckoutController {
	
	 @ModelAttribute("navigationMessage")
	   public String setUpMessage() {
	      return "toCheckout";
	   }
	 
	@GetMapping("/checkout")
	public String getCheckout(@SessionAttribute(name = "account",required = false) AccountDTO account) {
		if(account==null) {
			return "redirect:/login";
		}
		return "confirmAddress";		
	}
}
