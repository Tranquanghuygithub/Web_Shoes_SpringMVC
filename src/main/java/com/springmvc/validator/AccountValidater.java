package com.springmvc.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springmvc.model.AccountDTO;

@Component

public class AccountValidater implements Validator {	
		@Override
		public boolean supports(Class<?> clazz) {
			// Kiem tra doi tuog truyen vao la user
			return AccountDTO.class.isAssignableFrom(clazz);
		}

		@Override
		public void validate(Object target, Errors errors) {
			// Error chua cac loi
			AccountDTO accountDTO= (AccountDTO) target; 
			
			if(accountDTO.getUsername()== null || accountDTO.getPassword().length() ==0) {
				errors.rejectValue("username", "field.required"); 
			}
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password" ,"field.required");
		}

}
