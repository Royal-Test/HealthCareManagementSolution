package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import com.qa.BaseTest;
import com.qa.pages.*;


public class LoginTest extends BaseTest {
	
	LoginPage LoginPage;
	DashboardPage DashboardPage;
		  
	
		  @BeforeMethod
		  public void beforeMethod() {
			  LoginPage = new LoginPage();
		  }
		
		  
		  @Test
		  public void successfulLogin() {
			  LoginPage.enterUserName("admin");
			  LoginPage.enterUserPassword("pass123");
			  DashboardPage = LoginPage.pressLoginButton();
			  
		  }
		  

}
