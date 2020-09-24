package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.CartDTO;
import com.springmvc.model.ItemDTO;
import com.springmvc.model.ProductDTO;
import com.springmvc.service.ProductService;

@Controller
public class CartController {
	@Autowired
	ProductService productService;
	@RequestMapping(value = "/addToCart", method = RequestMethod.POST)
	public String addToCart(Model model ,HttpSession session, HttpServletRequest request,
			@ModelAttribute(name = "itemDTO") ItemDTO itemDTO) {
		int quantity=0;
		ProductDTO productDTO = productService.getProductById(itemDTO.getId());
		itemDTO.setSize(Integer.valueOf(itemDTO.getTmp()));
		itemDTO.setProductDTO(productDTO);
		CartDTO cartDTO;
	    session=request.getSession();
	    cartDTO = (CartDTO) session.getAttribute("cartDTO");
		if (cartDTO == null) {
			cartDTO= new CartDTO();
			List<ItemDTO> itemList = new ArrayList<ItemDTO>();
			itemList.add(itemDTO);
			cartDTO.setItemList(itemList);
			cartDTO.setTotalPrice();
			quantity=cartDTO.getQuantity();
			session.setAttribute("quantity", quantity);
			session.setAttribute("cartDTO", cartDTO);
			return "cart";
		} else {
			List<ItemDTO> itemList = cartDTO.getItemList();
			int k = 0;
			for (ItemDTO item : itemList) {
				if (item.getId() == itemDTO.getId() && item.getSize() == itemDTO.getSize()) {
					// neu co new product trugn voi trogn gio hang
					k = 1;
					item.setQuantity(item.getQuantity() + itemDTO.getQuantity());
					break;
				}
			}
			if (k == 0) {
				itemList.add(itemDTO);

			}
			cartDTO.setItemList(itemList);
			cartDTO.setTotalPrice();
			quantity=cartDTO.getQuantity();
			session.setAttribute("quantity", quantity);
			session.setAttribute("cartDTO", cartDTO);
		}
		return "cart";
	}

//	@RequestMapping(name = "/viewCart", method = RequestMethod.GET)
//	public String viewCart(HttpSession session) {
//		
//		return "cart";
//
//	}

	@RequestMapping(value = "/deleteProductCart/{size}/{productId}")
	public String deleteProduct(HttpSession session,  @PathVariable(name="size") int size,
			@PathVariable(name = "productId") long productId) {

			CartDTO cart = (CartDTO) session.getAttribute("cartDTO");
			List<ItemDTO> itemList = cart.getItemList();
			for (int i = 0; i < itemList.size(); i++) {
				if (itemList.get(i).getId() == productId && itemList.get(i).getSize()==size) {
					itemList.remove(i);
					break;
				}
			}
			cart.setItemList(itemList);
			cart.setTotalPrice();
			session.setAttribute("cartDTO", cart);
		return "cart";
	}

	@RequestMapping(value = "/updateProductCart", method = RequestMethod.GET)
	public String updateProduct(HttpServletRequest request, HttpSession session, @RequestParam(name = "size") int size,
			@RequestParam(name = "productId") long productId, @RequestParam(name = "quantity")int quantity) {

		session=request.getSession();
		System.out.println("AA");
			CartDTO cart = (CartDTO) session.getAttribute("cartDTO");
			List<ItemDTO> itemList = cart.getItemList();
			
			for (int i = 0; i < itemList.size(); i++) {
				if (itemList.get(i).getId() == productId && itemList.get(i).getSize()== size) {
					itemList.get(i).setQuantity(quantity);
					break;
				}
			}
			cart.setItemList(itemList);
			cart.setTotalPrice();
			session.setAttribute("cartDTO", cart);
		return "cart";
	}


}
