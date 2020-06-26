package com.springmvc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springmvc.model.ProductDTO;

@Component

public class ProductValidator implements Validator {	
		@Override
		public boolean supports(Class<?> clazz) {
			// Kiem tra doi tuog truyen vao la user
			return ProductDTO.class.isAssignableFrom(clazz);
		}

		@Override
		public void validate(Object target, Errors errors) {
			// Error chua cac loi
			ProductDTO product= (ProductDTO) target; 
			
			if(product.getName()== null || product.getName().length() ==0) {
				errors.rejectValue("name", "field.required"); 
			}
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "category" ,"field.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sizes" ,"field.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "brand" ,"field.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description" ,"field.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fileData" ,"field.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "color" ,"field.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "object" ,"field.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "quantity" ,"field.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price" ,"field.required");
		}

}
