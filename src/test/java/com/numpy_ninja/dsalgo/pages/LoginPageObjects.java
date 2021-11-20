package com.numpy_ninja.dsalgo.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.numpy_ninja.dsalgo.utility.BrowserFactory;


public class LoginPageObjects {
	WebDriver driver;

	//Constructor
	public LoginPageObjects(WebDriver driver)
	{
	this.driver = driver;
	}

	//First Step : Defining WebElements
	@FindBy(id = "txtUsername" ) WebElement usernameEdit;
	@FindBy(id = "txtPassword" ) WebElement passwordEdit;
	@FindBy(id = "btnLogin" ) WebElement loginButton;




	//Step 2: Perform actions
	public void loginvalidation(String username, String password)
	{
	usernameEdit.sendKeys(username);
	Reporter.log("Username value is entered");

	passwordEdit.sendKeys(password);
	Reporter.log("Password value is entered");

	loginButton.click();
	Reporter.log("Submit button is entered");
	}

 
}
