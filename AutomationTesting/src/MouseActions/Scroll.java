package MouseActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium.dev");
		Thread.sleep(2000);
		Actions mouse = new Actions(driver);
		//mouse.scrollToElement(driver.findElement(By.linkText("About Selenium"))).perform();
		
		mouse.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		mouse.scrollByAmount(0, 1000).perform();
		Thread.sleep(2000);
		mouse.scrollByAmount(0, -2000).perform();
		Thread.sleep(1000);
		}		
}

