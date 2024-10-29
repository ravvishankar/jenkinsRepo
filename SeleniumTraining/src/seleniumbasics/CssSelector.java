package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Mobiles");
		// # => can be used for id
		// . => can be used for class name
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Bike");
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		driver.close();
		
		
		
		
		
	}

}
