package com.InternetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.InternetBanking.PageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void LoginTest()
	{
		
		driver.get(baseURL);
		logger.info("The URL is Opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("UserName is Enter");
		lp.SetPassWord(password);
		logger.info("Password is Enter");
		lp.ClickSubmit();
		logger.info("Clicked on Submit button");
		
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://circle.testautomationacademy.in/" );
	
	}
	
		
	

}
