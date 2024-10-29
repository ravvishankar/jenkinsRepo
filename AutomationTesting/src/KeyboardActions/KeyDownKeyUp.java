package KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownKeyUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement name =driver.findElement(By.id("name"));
		action.keyDown(name, Keys.SHIFT).sendKeys("1234567890").perform();
		action.keyUp(name, Keys.SHIFT).perform();
		WebElement email =driver.findElement(By.id("email"));
		Thread.sleep(1000);
		action.keyDown(email, Keys.SHIFT).sendKeys("ravishankar2gmail.com").perform();
//		driver.quit();
	}

}
