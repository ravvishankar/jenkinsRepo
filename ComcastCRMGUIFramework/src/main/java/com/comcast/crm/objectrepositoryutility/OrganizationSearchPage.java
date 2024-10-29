package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationSearchPage {
	WebDriver driver;
	public OrganizationSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="search_text")
	private WebElement searchBox;
	
	@FindBy(name="search")
	private WebElement searchBtn;
	
	@FindBy(linkText = "A2B")
	private WebElement orgName;
	
	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	

}
