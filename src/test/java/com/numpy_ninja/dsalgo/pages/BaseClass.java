package com.numpy_ninja.dsalgo.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.numpy_ninja.dsalgo.utility.BrowserFactory;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class BaseClass {
	
  
  public WebDriver driver;

	@BeforeClass
	public void beforeClass()
	{
	driver = BrowserFactory.startApplication(driver, "webdriver.chrome.driver", "C:\\Users\\supriya\\Desktop\\chromedriver.exe");

	Reporter.log("Welcome to Home page");
		}

	@AfterClass
		public void afterClass()
		{
		BrowserFactory.quitBrowser(driver);
		}

}