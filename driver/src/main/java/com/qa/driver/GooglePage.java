package com.qa.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
	
	@FindBy(xpath= "//*[@id=\"sb_form_go\"]")
	private WebElement searchBox;
	
	public void searchFor(String text) {
		searchBox.sendKeys(text);
		searchBox.submit();
	}

}
