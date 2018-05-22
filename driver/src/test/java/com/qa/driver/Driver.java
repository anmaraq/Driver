package com.qa.driver;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;

public class Driver {
	
	WebDriver driver;
	
	
	@After
	public void teardown() {
		driver.quit();
	}

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	@Test
	public void layoutTest() {
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://outlook.live.com/owa/?authRedirect=true");
		driver.get("https://www.google.com/search?source=hp&ei=dtkCW7awDcrjkgXn_YvQBw&q=netflix&oq=netflix&gs_l=psy-ab.3..0i131k1j0j0i131k1l2j0l2j0i131k1j0l3.3028.7009.0.7421.8.6.0.2.2.0.78.407.6.6.0..3..0...1c.1.64.psy-ab..0.8.419....0.RsvNZqv7Z3o");
		driver.get("https://www.netflix.com/gb/");
		driver.get("https://www.google.com/");
	}
	
	
}
