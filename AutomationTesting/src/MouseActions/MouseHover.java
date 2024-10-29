package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement ComputersLink = driver.findElement(By.linkText("COMPUTERS"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(ComputersLink).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Notebooks")).click();
		Thread.sleep(2000);
		//driver.quit();
		
		
		
		
		
	}

}
