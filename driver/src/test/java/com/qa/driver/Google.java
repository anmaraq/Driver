package com.qa.driver;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Google {

	WebDriver driver;
	
	@After
	
	public void teardown() {
		driver.quit();
	}
	
	@Before
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bing.com/");
	}
	
	@Test
	public void testGoogleSearch() throws InterruptedException {
		GooglePage page = PageFactory.initElements(driver, GooglePage.class);
		page.searchFor("How to leave work early");
		
		
		Thread.sleep(3000);
	
		
	}

}
