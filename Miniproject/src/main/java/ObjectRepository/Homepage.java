package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class Homepage {
	public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//li[@id='menu-item-67']/a")
	private WebElement shopByCategory;
	
	@FindBy (xpath = "//li[@id='menu-item-59']/a")
	private WebElement accessoriesLink;
	
	public WebElement getShopByCategory() {
		return shopByCategory;
	}

	public WebElement getAccessoriesLink() {
		return accessoriesLink;
	}
		
	
}

