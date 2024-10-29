package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Organizations")
	private WebElement orglink;

	@FindBy(linkText = "Contacts")
	private WebElement contactlink;

	public WebElement getCampaignlink() {
		return campaignlink;
	}

	@FindBy(linkText = "More")
	private WebElement morelink;

	@FindBy(linkText = "Campaigns")
	private WebElement campaignlink;
	
	@FindBy (xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrator;
	
	@FindBy (linkText = "Sign Out")
	private WebElement signout;
	
	@FindBy (name="Vendors")
	private WebElement vendors;
	

	public WebElement getAdmin() {
		return administrator;
	}

	public WebElement getSignout() {
		return signout;
	}

	public WebElement getMorelink() {
		return morelink;
	}

	public WebElement getVendors() {
		return vendors;
	}

	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getContactlink() {
		return contactlink;
	}
	
	public void logOut() {
		Actions action = new Actions(driver);
		action.moveToElement(administrator).perform();
		signout.click();
			
	}

}
