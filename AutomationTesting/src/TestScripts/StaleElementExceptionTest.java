package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ObjectRepository.BooksPage;
import ObjectRepository.WelcomePage;

public class StaleElementExceptionTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage wp = new WelcomePage(driver);
		BooksPage bp = new BooksPage(driver);
		wp.getBooksLink().click();
		Select select = new Select(bp.getSortBy());
		select.selectByIndex(3);
		select.selectByIndex(2);
		select.selectByIndex(1);
		select.selectByIndex(0);
		Thread.sleep(3000);
		driver.quit();
		
	
		
		
		
		
		
	}

}
