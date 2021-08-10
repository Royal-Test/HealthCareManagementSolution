package com.qa;

import org.testng.annotations.BeforeMethod;

import com.qa.utils.TestUtils;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;


public class BaseTest {
	protected WebDriver driver;
	
  
  public BaseTest() {
	  
	  PageFactory.initElements( driver, this);
	  
  }
  
   
  
  @BeforeMethod
  public void setUp() {
	  
	  try {
		  
		  driver = new DriverManager().initializeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
	  } catch (Exception e) {  
		  e.printStackTrace();	  
	  }
	  	  
  }
  
 
  public void waitForVisibility(WebElement e) {
	  WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
	  wait.until(ExpectedConditions.visibilityOf(e));
  }
  
  public void click(WebElement e) {
	  waitForVisibility(e);
	  e.click();
  }
  
  public void sendKeys(WebElement e, String txt) {
	  waitForVisibility(e);
	  e.sendKeys(txt);
  }
  
  public String getAttribute(WebElement e, String attribute) {
	  waitForVisibility(e);
	  return e.getAttribute(attribute);
  }
  
  
  
  
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }

}
