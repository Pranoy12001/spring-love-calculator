package com.pranoy.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pranoy.lc.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "username.empty", "Username cant be empty");
		
		String userName = ((UserRegistrationDTO) target).getUserName();
		
		if (!userName.contains("_")) {
			errors.rejectValue("userName", "username.invalidString", "username must contain a '_'");
		}
	}

}
