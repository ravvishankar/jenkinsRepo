package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorInfoPage {
	WebDriver driver;
	public VendorInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (className ="lvtHeaderText")
	private WebElement headerMsg;
	
	@FindBy (linkText = "Products")
	private WebElement productslink;
	
	public WebElement getProductslink() {
		return productslink;
	}

	public WebElement getHeaderMsg() {
		return headerMsg;
	}

}