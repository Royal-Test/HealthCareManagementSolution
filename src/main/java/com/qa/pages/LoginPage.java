package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.BaseTest;


public class LoginPage extends BaseTest {
	@FindBy(name ="username_id") private WebElement usernameTxtFld;
	@FindBy(name ="password") private WebElement passwordTxtFld;
	@FindBy(name ="login") private WebElement loginBtn;
	
	public LoginPage enterUserName(String username) {
		sendKeys(usernameTxtFld, username);
		return this;
	}
	
	public LoginPage enterUserPassword(String password) {
		sendKeys(passwordTxtFld, password);
		return this;
	}
	
	public DashboardPage pressLoginButton() {
		click(loginBtn);
		return new DashboardPage();
	}
	
}
