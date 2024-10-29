package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOrganizationPage {
	WebDriver driver;
	public CreateNewOrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name="accountname")
	private WebElement orgNameEdt;
	
	@FindBy (xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy (name="industry")
	private WebElement industryDrp;
	
	public WebElement getOrgName() {
		return orgNameEdt;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createOrg(String orgName) {
		orgNameEdt.sendKeys(orgName);
		saveButton.click();
	}
	
	public void createOrg(String orgName, String industry ) {
		orgNameEdt.sendKeys(orgName);
		Select sel = new Select(industryDrp);
		sel.selectByVisibleText(industry);
		saveButton.click();
	}
	
	
	
	
	

}
