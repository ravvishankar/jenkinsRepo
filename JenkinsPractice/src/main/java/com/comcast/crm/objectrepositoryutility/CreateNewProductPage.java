package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProductPage {
	WebDriver driver;
	public CreateNewProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (name="productname")
	private WebElement productname;
	
	@FindBy (name="sales_start_date")
	private WebElement startDate;
	
	@FindBy (name="sales_end_date")
	private WebElement endDate;
	
	@FindBy (xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement selVendor;
	
	@FindBy (id="//a[.='A2B_235']")
	private WebElement prodImage;
	
	@FindBy (xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getStartDate() {
		return startDate;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public WebElement getSelVendor() {
		return selVendor;
	}
	
	
	public WebElement getProdImage() {
		return prodImage;
	}
	
	
	

}
