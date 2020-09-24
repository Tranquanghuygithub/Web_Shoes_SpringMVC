package com.springmvc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springmvc.entity.OrderDetail;
import com.springmvc.model.OrderDTO;
import com.springmvc.model.ProductDTO;

@Component

public class OrderValidator implements Validator {	
		@Override
		public boolean supports(Class<?> clazz) {
			// Kiem tra doi tuog truyen vao la user
			return OrderDTO.class.isAssignableFrom(clazz);
		}

		@Override
		public void validate(Object target, Errors errors) {
			// Error chua cac loi
			
			OrderDTO orderDTO= (OrderDTO) target; 
			if(orderDTO.getShippingId()==0) {
				errors.rejectValue("shippingId", "field.required"); 
			}
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "paymentType" ,"field.required");
		}

}
