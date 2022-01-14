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

	@FindBy(name="log")
	WebElement txtUserName;
	
	@FindBy(name="pwd")
	WebElement txtPassword;
	
	@FindBy(name="wp-submit")
	WebElement btnLogin;


	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	} 
	
	public void SetPassWord(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void ClickSubmit()
	{
		btnLogin.click();
	}

}


