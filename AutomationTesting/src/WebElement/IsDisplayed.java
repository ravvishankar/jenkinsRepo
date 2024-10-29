package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		Thread.sleep(1000);
		boolean isLogoDisplayed = driver.findElement(By.className("nav-logo-link nav-progressive-attribute")).isDisplayed();
		if (isLogoDisplayed == true)
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		driver.quit();
	
				
	}

}
