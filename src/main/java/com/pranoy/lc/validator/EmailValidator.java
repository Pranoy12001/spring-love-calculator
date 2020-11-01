package com.pranoy.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pranoy.lc.api.UserRegistrationDTO;

public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.
		rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty");
		
		String email = ((UserRegistrationDTO) target).getCommunicationDTO().getEmail();
		
		if (!email.endsWith("@seliniumexpress.com")) {
			errors.rejectValue("communicationDTO.email", "email.invalidFormat");
		}
	}

}
