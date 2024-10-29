package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOpportunitiesPage {
	WebDriver driver;
	public CreateNewOpportunitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (name="potentialname")
	private WebElement opportunityName;
	
	@FindBy (xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement orgName;
	
	@FindBy (xpath="(//img[@src='themes/softed/images/select.gif'])[2]")
	private WebElement campaignName;
	
	@FindBy (xpath="(//input[@type='submit'])[1]")
	private WebElement OpportunitySaveBtn;
	
	public WebElement getOpportunitySaveBtn() {
		return OpportunitySaveBtn;
	}

	public WebElement getOpportunityName() {
		return opportunityName;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getCampaignName() {
		return campaignName;
	}

}
