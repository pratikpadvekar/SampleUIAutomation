package com.InternetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	WebElement txtUserName;
	
	@FindBy(xpath = "//input[@placeholder=\"Password\"]")
	WebElement txtPassword;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement ClickOnSignIn;
	
	@FindBy(xpath = "//div[@class=\"sidebar-icon sidebar-logout\"]")
	WebElement ClickOnLogOut;
	
	public void SetUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void SetPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickOnsignIn()
	{
		ClickOnSignIn.click();
	}
	
	
	public void ClickOnLogout()
	{
		ClickOnLogOut.click();
	}

}


