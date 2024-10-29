package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorSearchPage {
	WebDriver driver;
	public VendorSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (name="search_text")
	private WebElement searchField;
	
	@FindBy (name="search")
	private WebElement searchNowBtn;
	
	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}
	

}
