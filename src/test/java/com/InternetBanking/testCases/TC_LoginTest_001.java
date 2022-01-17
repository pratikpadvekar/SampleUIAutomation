package com.InternetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.InternetBanking.PageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void LoginTest() throws IOException
	{
		
		driver.get(baseURL);
		logger.info("The URL is Opened");
		
		LoginPage lp = new LoginPage(driver);
				
		lp.SetUserName(username);
		logger.info("Enter UserName");
		
		lp.SetPassword(password);
		logger.info("Enter Password");
		
		lp.clickOnsignIn();
		logger.info("Click on SingIn button");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://360-uatv2.servify.tech/servicerequests" );
	
		lp.ClickOnLogout();
		logger.info("Click on Logout button");
		
	}
	
		
	

}
