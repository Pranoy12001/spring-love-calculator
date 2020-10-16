package com.pranoy.lc.validator;

import java.util.Objects;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {
	Integer lower;
	Integer upper;

	@Override
	public void initialize(Age age) {
		//for post process type work in here
		this.lower = age.lower();
		this.upper = age.upper();
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		// To write logic here
		if (Objects.isNull(age)) {
			return false;
		}
		
		if (age < lower || age > upper) {
			return false;
		}
		
		return true;
	}

}
