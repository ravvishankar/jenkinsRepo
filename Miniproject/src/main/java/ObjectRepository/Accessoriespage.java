package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accessoriespage {
	public Accessoriespage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "(//div[@class='astra-shop-summary-wrap'])[3]")
	private WebElement leatherWatch;
	
	public WebElement getleatherWatch() {
	return leatherWatch;
	}

}
