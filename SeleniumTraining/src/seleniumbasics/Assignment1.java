package seleniumbasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchfield = driver.findElement(By.xpath("//div[@class='_2SmNnR']/child::input"));
		searchfield.sendKeys("iphone less than 70000");
		Actions action = new Actions(driver);
		action.keyDown(Keys.ENTER).perform();
		action.keyUp(Keys.ENTER).perform();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		driver.quit();

	}

}
