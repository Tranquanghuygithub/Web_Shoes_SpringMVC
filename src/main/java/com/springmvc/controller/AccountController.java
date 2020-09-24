package com.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springmvc.model.AccountDTO;
import com.springmvc.model.CustomerDTO;
import com.springmvc.service.AccountService;
import com.springmvc.service.CustomerService;
import com.springmvc.validator.AccountValidater;

@Controller
@SessionAttributes("account")


public class AccountController {
	@Autowired
	AccountValidater accountValidater;
	
	@Autowired 
	private AccountService accountService;
	
	@Autowired
	private CustomerService cusService;
	
	 @ModelAttribute("account")
	   public AccountDTO setUpUserForm() {
	      return new AccountDTO();
	   }
	 @GetMapping("/login")
	 public String login() {
		 return "login";
	 }
	 @PostMapping("/doLogin")
	 public String doLogin( @ModelAttribute(name = "account") AccountDTO accountInfo, @SessionAttribute(name="navigationMessage",required = false) String navigation, Model model,HttpSession session, BindingResult bindingResult ){
		 accountValidater.validate(accountInfo, bindingResult);
		 if(bindingResult.hasErrors()) {
			 //if error
			 return "login";
		 }
		 //accountInfo is account user enter
		 //if login sucessfull
		 AccountDTO accountDTO = accountService.findAccount(accountInfo.getUsername());
		if(accountDTO.getPassword().equals(accountInfo.getPassword())) {
			
			if( accountDTO.getRole()==0 && accountDTO.getDisable()==0) {
				//customer
				CustomerDTO  cusDTO=cusService.getCusByUsername(accountDTO.getUsername());
				session.setAttribute("customer", cusDTO);
				
				if(navigation!=null) return "redirect:/checkout";
				return "redirect:/home";
			}
			else if( accountDTO.getRole()==1 && accountDTO.getDisable()==0 ) {
				//manager
				//session.setAttribute("manager", );
				return "redirect:/admin/managerProduct";
				
			}
			else {
				//tai khoan bi vo hieu hoa
				String message="Tài khoản đã bị khóa";
				model.addAttribute("message", message);
			}
				
		}
		else {
			// tai khoan hoac mat khau sai
			String message="Tài khoản hoặc mật khẩu sai";
			model.addAttribute("message", message);
		}
		 return "login";
	 }
	 @GetMapping("/logout")
	 public String logout(HttpSession session) {
		 session.removeAttribute("cartDTO");
		 session.removeAttribute("account");
		 session.removeAttribute("address");
		 session.removeAttribute("orderDTO");
		 return "redirect:/login";
	 }
	 
}
