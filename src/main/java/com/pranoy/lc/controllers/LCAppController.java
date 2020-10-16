package com.pranoy.lc.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pranoy.lc.api.UserInfoDTO;

@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String showHomePage (@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage (@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {
		
		if (result.hasErrors()) {
			return "home-page";
		}
		
		return "result-page";
	}
}
