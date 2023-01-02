package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver; //create Webdriver object-ldriver (local driver), import WebDriver class
	
	public LoginPage (WebDriver rdriver) // write a constructor, LoginPage, to initiate the driver object, 
									//it will take driver as parameter-rdriver(remote driver-WebDriver object)
	{								//constructor will be executed whenever we create a object for a class
		ldriver=rdriver; // initiate the driver object
		PageFactory.initElements(rdriver, this);//additional method for using @findBy method
												//rdriver is driver object, this is a variable here
	}
	//find elements
	@FindBy (name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy (name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy (name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy (xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;

	//action methods for the elements
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
