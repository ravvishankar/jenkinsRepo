package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApparelandshoesPage {
	public ApparelandshoesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public WebElement getPageSize() {
		return pageSize;
	}

	public Select getSelectPagesize() {
		return selectPagesize;
	}

	public WebElement getWrinkleFreeShirt() {
		return wrinkleFreeShirt;
	}

	@FindBy (id = "products-pagesize")
	private WebElement pageSize;
	
	Select selectPagesize = new Select(pageSize);
	
	@FindBy(linkText = "Men's Wrinkle Free Long Sleeve")
	private WebElement wrinkleFreeShirt;
	
	
	
	
	
	
	
	
	
	
}
