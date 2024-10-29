package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WrinkleFreeShirt {
	public WrinkleFreeShirt(WebDriver driver) {
		PageFactory.initElements(driver, this);	
}
	@FindBy (id = "product_attribute_10_7_36")
	private WebElement size;
	
	Select selectShirtsize = new Select(size);
	
	@FindBy (className = "cart-label")
	private WebElement shoppingcart;
	
	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getSize() {
		return size;
	}

	public Select getSelectShirtsize() {
		return selectShirtsize;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	@FindBy (id = "add-to-cart-button-10")
	private WebElement addtocart;

}
