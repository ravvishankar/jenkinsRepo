package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPage {
	WebDriver driver;
	public ProductSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getProdSearchEdt() {
		return prodSearchEdt;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	@FindBy (id="search_txt")
	private WebElement prodSearchEdt;
	
	@FindBy (name="search")
	private WebElement searchBtn;
	
	@FindBy (linkText = "Gulab Jamun")
	private WebElement productName;
	
	public WebElement getProductName() {
		return productName;
	}

}
