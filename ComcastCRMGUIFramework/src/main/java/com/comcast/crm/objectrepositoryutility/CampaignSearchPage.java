package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignSearchPage {
	WebDriver driver;
	public CampaignSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name="search_text")
	private WebElement campaignsearchBox;
	
	@FindBy (name="search")
	private WebElement campaignsearchBtn;
	
	@FindBy (linkText = "StreetShow")
	private WebElement campaignName;
	
	public WebElement getCampaignName() {
		return campaignName;
	}

	public WebElement getCampaignsearchBox() {
		return campaignsearchBox;
	}

	public WebElement getCampaignsearchBtn() {
		return campaignsearchBtn;
	}

}
