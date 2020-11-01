package com.pranoy.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "* User name can't be blank")
	@Size(min = 3, max = 15, message = "{username.size}")
	private String userName;

	@NotBlank(message = "* Crush name can't be blank")
	@Size(min = 3, max = 15, message = "Your Crush must be between 3 to 15 character")
	private String crushName;

	@AssertTrue(message = "Need to confirm terms and conditions")
	private boolean termsAndConditions;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public boolean isTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

}
