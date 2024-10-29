package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart {
	public ShoppingCart (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (className = "country-input valid")
	private WebElement selectcountry;
	
	Select countryDropdown = new Select(selectcountry);
	
	@FindBy (id = "ZipPostalCode")
	private WebElement postalcode;
	
	@FindBy (id = "termsofservice")
	private WebElement termsofservice;
	
	
	

}
