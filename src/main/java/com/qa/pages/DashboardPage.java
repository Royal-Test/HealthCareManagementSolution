package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.BaseTest;

public class DashboardPage extends BaseTest {
	
	@FindBy(xpath ="//span[@class=\"username-hide-on-mobile\"]") private WebElement DanpheVersionNum;
	
	
	public String getVersionNumber() {
		return getAttribute(DanpheVersionNum, "text");
	}

}
