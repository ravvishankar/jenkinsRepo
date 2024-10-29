package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	public Checkoutpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id ="billing_email")
	private WebElement emailTextfield;
	
	@FindBy (id = "billing_first_name")
	private WebElement firstnameTextfield;
	
	@FindBy (id = "billing_last_name")
	private WebElement lastnameTextfield;
	
	@FindBy (id = "billing_company")
	private WebElement companyName;
	
	@FindBy (xpath = "//span[@class='select2-selection select2-selection--single'and@aria-label='Country / Region']")
	private WebElement countryDropdown;
	
	@FindBy (id = "billing_address_1")
	private WebElement streetTextfield;
	
	@FindBy (id = "billing_address_2")
	private WebElement address;
	
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}

	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getStreetTextfield() {
		return streetTextfield;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCityTextfield() {
		return cityTextfield;
	}

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public WebElement getPincodeTextfield() {
		return pincodeTextfield;
	}

	public WebElement getPhonenoTextfield() {
		return phonenoTextfield;
	}

	public WebElement getAddinfoTextfield() {
		return addinfoTextfield;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}
	@FindBy (id = "billing_city")
	private WebElement cityTextfield;
	
	@FindBy (xpath = "//span[@class='select2-selection select2-selection--single'and@aria-label='State']")
	private WebElement stateDropdown;
	
	@FindBy (id = "billing_postcode")
	private WebElement pincodeTextfield;
	
	@FindBy (id = "billing_phone")
	private WebElement phonenoTextfield;
	
	@FindBy (id = "order_comments")
	private WebElement addinfoTextfield;
	
	@FindBy (id = "place_order")
	private WebElement placeOrder;
	
	
	
	
	
	

}
