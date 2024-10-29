package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewVendorsPage {
	WebDriver driver;
	public CreateNewVendorsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name="vendorname")
	private WebElement vendorname;
	
	@FindBy (xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public WebElement getVendorname() {
		return vendorname;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	

}
