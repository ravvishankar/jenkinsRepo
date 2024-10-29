package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class WelcomePage {
	public WelcomePage (WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getApparelandshoesLink() {
		return apparelandshoesLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	@FindBy (linkText = "Register")
	private WebElement registerLink;
	
	@FindBy (linkText = "Log in")
	private WebElement loginLink;
	
	public WebElement getBooksLink() {
		return booksLink;
	}

	public void setBooksLink(WebElement booksLink) {
		this.booksLink = booksLink;
	}

	@FindBy (id = "small-searchterms") 
	private WebElement searchField;
	
	@FindBy (linkText = "Apparel & Shoes")
	private WebElement apparelandshoesLink;
	
	@FindBy (linkText = "BOOKS")
	private WebElement  booksLink;
	
		
	}
