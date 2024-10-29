package KeyboardActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT).sendKeys("ravi ").perform();
		action.keyUp(Keys.SHIFT).sendKeys("shankar").perform();	
	}

}
