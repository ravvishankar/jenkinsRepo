package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kayak.co.in/flights");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[local-name()='svg' and @class='c_neb-item-icon']")).click();
		WebElement departure = driver.findElement(By.xpath("//input[@aria-label='Flight origin input']"));
		departure.sendKeys("Chennai");
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).pause(Duration.ofSeconds(2)).perform();
		act.keyUp(Keys.ARROW_DOWN).perform();
		act.keyDown(Keys.ENTER).perform();
		act.keyUp(Keys.ENTER).perform();
		WebElement destination = driver.findElement(By.xpath("//input[@aria-label='Flight destination input']"));
		destination.click();
		destination.sendKeys("changi");
		driver.findElement(By.xpath("//span[@class='vPgG-name']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Start date']")).click();
		driver.findElement(By.xpath("//div[@aria-label='11 October, 2024 Prices on this day are around average']"))
				.click();
		driver.findElement(By.xpath("//div[@aria-label='14 November, 2024 Prices on this day are below average']"))
				.click();
		driver.findElement(By.xpath("//div[@class='RxNS-button-container']/parent::button")).click();

	}

}
