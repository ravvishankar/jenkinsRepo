package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrganizationPage {
	
	WebDriver driver;
	public OrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement orgButton;
	
	@FindBy(name="search_text")
	private WebElement searchTxt;
	
	@FindBy (xpath="//input[@name='submit']")
	private WebElement searchButton;

	@FindBy (name="search_field")
	private WebElement searchDropdown;
	
	@FindBy (linkText = "del")
	private WebElement delete;
	

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getOrgButton() {
		return orgButton;
	}
	
	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSearchTxt() {
		return searchTxt;
	}
	
	public void orgoption(String text) {
	Select sel = new Select(searchDropdown);
	sel.selectByVisibleText(text);	
	}
	
}
