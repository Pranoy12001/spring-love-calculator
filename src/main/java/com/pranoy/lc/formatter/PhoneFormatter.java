package com.pranoy.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.pranoy.lc.api.Phone;

public class PhoneFormatter implements Formatter<Phone>{

	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		int index = text.indexOf('-');
		
		if (index == 0) {
			text = "880" + text;
		}
		
		if (index == -1) {
			text = "880-" + text; 
		}
		
		String[] formatedPhoneNo = text.split("-");
		Phone phone = new Phone();
		phone.setCountryCode(formatedPhoneNo[0]);
		phone.setUserNumber(formatedPhoneNo[1]);
		
		return phone;
	}

}
