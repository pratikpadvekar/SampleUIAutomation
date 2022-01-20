package com.InternetBanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.InternetBanking.PageObjects.LoginPage;
import com.InternetBanking.PageObjects.RaiseRequestPage;

public class TC_AddNewRequest_003 extends BaseClass{

	@Test
	public void addNewRequest() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		driver.get(baseURL);
		lp.SetUserName(username);
		lp.SetPassword(password);
		lp.clickOnsignIn();
		
		Thread.sleep(3000);
		
		
		RaiseRequestPage addreq = new RaiseRequestPage(driver);
		addreq.linkRaiseRequest();
		Thread.sleep(3000);
		//addreq.mobileNoTxtBox("8082388068");
		String mobile = randomNum();
		addreq.mobileNoTxtBox(mobile);
		Thread.sleep(3000);
		addreq.ClickOnsubmitBtnMobileNo();
		Thread.sleep(3000);
		addreq.fullNameTxtBox("Pratik Padvekar");
		Thread.sleep(3000);
		String email = randomString()+"@gmail.com";
		addreq.EmaildIDTxtBox(email);
		Thread.sleep(5000);
		addreq.ClickOnsubmitBtnCutomerDetails();	
		
	}
	
	public String randomString() {
		
		String generateString = RandomStringUtils.randomAlphabetic(8);
		return (generateString);
	}
	
	public static String randomNum() {
		String generateString2 = RandomStringUtils.randomNumeric(10);
		return (generateString2);
	}
	
}
