package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppingcartpage {
	public Shoppingcartpage (WebDriver driver){
		PageFactory.initElements(driver, this);
}
	@FindBy (linkText = "PROCEED TO CHECKOUT")
	private WebElement proceed2checkout;
	
	public WebElement getEmptyCart() {
		return emptyCart;
	}

	public WebElement getReturn2cart() {
		return return2cart;
	}
	@FindBy (xpath = "//a[@id='minus_qty']")
	private WebElement removeQty;
	
	@FindBy (xpath = "//div[@class='cart-empty woocommerce-info']")
	private WebElement emptyCart;
	
	@FindBy (xpath = "//p[@class='return-to-shop']/a")
	private WebElement return2cart;

	public WebElement getRemoveQty() {
		return removeQty;
	}

	public WebElement getProceed2checkout() {
		return proceed2checkout;
	}
	

	

}
