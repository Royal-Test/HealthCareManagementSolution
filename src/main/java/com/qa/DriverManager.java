package com.qa;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	protected   WebDriver driver;
	protected   Properties props;
	InputStream inputStream;
	
	
	public WebDriver initializeDriver() {
		
		try {
			  
			String propFileName = "config.properties";
			  String chromeDriverUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"+ File.separator
					  + "resources" + File.separator + "chromedriver.exe" ;
			  
			  inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			  props.load(inputStream);
			  System.setProperty(props.getProperty("chromeWebDriver"),chromeDriverUrl);
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get(props.getProperty("webUrl"));
			return driver;
			  
		  } catch (Exception e) {  
			 return null;	  
		  }
		
		
	}

}
