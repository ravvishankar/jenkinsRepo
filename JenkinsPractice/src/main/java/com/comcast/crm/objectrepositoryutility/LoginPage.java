package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

// Rule-1: Create a separate java class for every webpage in an application
public class LoginPage extends WebDriverUtility {
	WebDriver driver;
	// Rule-2: Object creation (Identify Elements using @FindBy annotations)

	@FindBy(name = "user_name")
	private WebElement usernameTxtfield;

	@FindBy(name = "user_password")
	private WebElement pwdTxtfield;

	@FindBy(id = "submitButton")
	private WebElement loginBtn;

	// Rule-3: Object Initialization

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Rule-4: Object Encapsulation

	public WebElement getUsernameTxtfield() {
		return usernameTxtfield;
	}

	public WebElement getPwdTxtfield() {
		return pwdTxtfield;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	// Rule-5: Object Utilisation
	
	//Provide Action
	
	public void loginToApp (String username, String password) {
		usernameTxtfield.sendKeys(username);
		pwdTxtfield.sendKeys(password);
		loginBtn.click();
	}
	
	public void loginToApp (String url, String username, String password) {
		implicitWait(driver);
		driver.get(url);
		driver.manage().window().maximize();
		usernameTxtfield.sendKeys(username);
		pwdTxtfield.sendKeys(password);
		loginBtn.click();
	}


}
