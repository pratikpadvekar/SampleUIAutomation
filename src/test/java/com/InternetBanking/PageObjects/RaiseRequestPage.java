package com.InternetBanking.PageObjects;

import javax.crypto.interfaces.DHPublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RaiseRequestPage {
	
	WebDriver ldriver;
	
	public RaiseRequestPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//div[@class=\"btn button-servify header-btn\"][2]")
	@CacheLookup
	WebElement linkRaiseRequest;
	
	
	@FindBy(xpath = "//input[@name=\"mobileNo\"]")
	@CacheLookup
	WebElement mobileNoTxtBox;
	
	@FindBy(xpath = "//input[@class=\"btn button-servify button-next\"][1]")
	@CacheLookup
	WebElement ClickOnsubmitBtnMobileNo;
	
	
	@FindBy(xpath = "//input[@id=\"fullname\"]")
	@CacheLookup
	WebElement fullNameTxtBox;
	
	
	@FindBy(xpath = "//input[@id=\"emailid\"]")
	@CacheLookup
	WebElement EmaildIDTxtBox;
	
	
	@FindBy(xpath = "//*[@id=\"customerDetails\"]/div[4]/input")
	@CacheLookup
	WebElement ClickOnsubmitBtnCutomerDetails;
	
	@FindBy(xpath = "//div[@style=\"text-align:left;height:auto\"]")
	@CacheLookup
	WebElement ClickOnConsumerProductDetails;
	
	@FindBy(xpath = "//*[@id=\"enterDeviceAttributes\"]/div[3]/div/input")
	@CacheLookup
	WebElement ClickOnsubmitbtnConsumerProductDetails;
	
	
	@FindBy(xpath = "//div[@class=\"item issue-item item-active\"]")
	@CacheLookup
	WebElement SelectAccessoriesbtn;
	
	
	@FindBy(xpath = "//*[@id=\"issuesSelection\"]/div[14]/input")
	@CacheLookup
	WebElement clickOnSubmitbtnAccessories;
	
	
	@FindBy(xpath = "//*[@id=\"logisticsContactDetails\"]/div[6]/input")
	@CacheLookup
	WebElement clickOnsubmitbtncommunicationDetails;
	
	@FindBy(xpath = "//div[@class=\"item address-item \"][1]")
	@CacheLookup
	WebElement clickOnAddress;
	
	@FindBy(xpath = "//div[@class=\"item subcat-item field-tip item-active-border \"]")
	@CacheLookup
	WebElement selectServiceMode;
	
	
	@FindBy(xpath = "//div[@class=\"item address-item-location item-active-border\"]")
	@CacheLookup
	WebElement selectServiceLocation;
	
	
	@FindBy(xpath = "//div[@class=\"item slot-item item-active-border\"]")
	@CacheLookup
	WebElement SelectDate;
	
	
	@FindBy(xpath = "//div[@class=\"item slot-item item-active-border \"]")
	@CacheLookup
	WebElement selectTimeSlot;
	
	
	@FindBy(xpath = "//*[@id=\"scheduleDateAndTime\"]/div[5]/input")
	@CacheLookup
	WebElement SubmitbtnServiceDetails;
	
	
	public void linkRaiseRequest() {
		linkRaiseRequest.click();
	}
		
	public void mobileNoTxtBox(String MobileNo) {
		mobileNoTxtBox.sendKeys(String.valueOf(MobileNo));
	}

	public void ClickOnsubmitBtnMobileNo() {
		ClickOnsubmitBtnMobileNo.click();
	}

	public void fullNameTxtBox(String fullname) {
	fullNameTxtBox.clear();
	fullNameTxtBox.sendKeys(fullname);

	}
	
	public void EmaildIDTxtBox(String EmailID) {
	EmaildIDTxtBox.clear();
	EmaildIDTxtBox.sendKeys(EmailID);
		
	}

	public void ClickOnsubmitBtnCutomerDetails() {
		
		ClickOnsubmitBtnCutomerDetails.click();
	}




}
