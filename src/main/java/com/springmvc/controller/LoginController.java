//package com.springmvc.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import com.springmvc.model.AccountDTO;
//
//@Controller
//@SessionAttributes("account")
//public class LoginController {
//	
//	 @ModelAttribute("account")
//	   public AccountDTO setUpUserForm() {
//	      return new AccountDTO();
//	   }
//	 
//	   @GetMapping("/login")
//	   public String login() {
//		   return "login";
//	   }
//	   @PostMapping("/dologin")
//	   public String doLogin(@ModelAttribute("account") AccountDTO account, Model model) {
//	      // Implement your business logic
//	      if () {
//	      } else {
//	         model.addAttribute("message", "Login failed. Try again.");
//	         return "login";
//	      }
//	      return "success";
//	   }
//}
