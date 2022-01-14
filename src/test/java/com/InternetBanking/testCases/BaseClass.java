package com.InternetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	
	public String baseURL = "https://circle.testautomationacademy.in/wp-login.php";
	public String username = "PPadvekar";
	public String password = "pratik123";
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// For Logs 
		logger = logger.getLogger("TestAutomation");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
