package com.pranoy.lc.controllers;


import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pranoy.lc.api.UserRegistrationDTO;
import com.pranoy.lc.propertyeditor.NamePropertyEditor;
import com.pranoy.lc.validator.EmailValidator;
import com.pranoy.lc.validator.UserNameValidator;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO) {
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success") 
	public String processUserReg(@Valid
			@ModelAttribute("userRegistrationDTO") UserRegistrationDTO userRegistrationDTO,
			BindingResult result) {
		
		if (result.hasErrors()) {
			return "user-registration-page";
		}
		
		return "registration-success";
	}
	
	@InitBinder
	public void initBinder (WebDataBinder binder) {
		System.out.println("This is init binder");
		
		StringTrimmerEditor editor = new StringTrimmerEditor(false); // If it is true it will make null object otherwise empty string
		binder.registerCustomEditor(String.class, "name", editor);
		
		
		NamePropertyEditor nameEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class, "name", nameEditor);
		
		//binder.setDisallowedFields("name");
		binder.addValidators(new UserNameValidator());
		binder.addValidators(new EmailValidator());
	}
}
