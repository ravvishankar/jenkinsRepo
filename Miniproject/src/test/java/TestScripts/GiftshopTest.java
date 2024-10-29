package TestScripts;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import ObjectRepository.Accessoriespage;
import ObjectRepository.Homepage;
import ObjectRepository.Watchpage;

public class GiftshopTest {
@Test
 public void homePage() throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://websitedemos.net/gift-shop-04/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Homepage hp = new Homepage(driver);
	Actions action = new Actions(driver);
	action.moveToElement(hp.getShopByCategory()).perform();
	Thread.sleep(2000);
	hp.getAccessoriesLink().click();
	Thread.sleep(1000);
	driver.quit();
	/*Accessoriespage ap = new Accessoriespage(driver);
	ap.getleatherWatch().click(); 
	Watchpage wp = new Watchpage(driver);
	wp.getAddqty().click();
	wp.getAdd2cart().click();
	wp.getAdd2cartBasket().click();
	wp.getViewcart().click();*/
		
}

@Test (dependsOnMethods = "homePage")
 public void accessoriesPage () throws InterruptedException {
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://websitedemos.net/gift-shop-04/");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 Accessoriespage ap = new Accessoriespage(driver);
 ap.getleatherWatch().click();
 Thread.sleep(1000);
 driver.quit();
}

@Test (dependsOnMethods = "accessoriesPage")
public void watchPage () {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://websitedemos.net/gift-shop-04/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Watchpage wp = new Watchpage(driver);
	wp.getAddqty().click();
	wp.getAdd2cart().click();
	wp.getAdd2cartBasket().click();
	wp.getViewcart().click();
	driver.quit();
	
}

}

	
	
	
	
//	
//	Shoppingcartpage sp = new Shoppingcartpage(driver);
//	Checkoutpage cp = new Checkoutpage(driver);
//	
//	/*ap.getleatherWatch().click();
//	wp.getQty().click();
//	wp.getAdd2cart().click();
//	wp.getAdd2cartBasket().click();
//	wp.getViewcart().click();

