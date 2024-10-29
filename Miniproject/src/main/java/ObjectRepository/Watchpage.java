package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Watchpage {

	public Watchpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddqty() {
		return addqty;
	}

	public WebElement getAdd2cart() {
		return add2cart;
	}

	public WebElement getAdd2cartBasket() {
		return add2cartBasket;
	}

	public WebElement getViewcart() {
		return viewcart;
	}
	@FindBy (id = "plus_qty")
	private WebElement addqty;
	
	@FindBy (name = "add-to-cart")
	private WebElement add2cart;
	
	@FindBy (xpath = "(//*[name()='svg'][@id=\"ast-basket-icon-svg\"])[1]")
	private WebElement add2cartBasket;
	
	@FindBy (linkText = "VIEW CART")
	private WebElement viewcart;

	}
