package KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

		public class KeyboardAction1 {
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		Actions action = new Actions(driver);
		action.keyDown(name, Keys.SHIFT).sendKeys("ravi shankar").perform();
			
	}

}
