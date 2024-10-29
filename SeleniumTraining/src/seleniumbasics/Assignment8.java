package seleniumbasics;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment8 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
		driver.findElement(By.xpath("//p[text()='Round-trip']/preceding-sibling::span")).click();
		driver.findElement(By.xpath("//p[text()='Enter city or airport']/parent::div")).click();
		WebElement departure = driver.findElement(By.xpath("//input[@type='text']"));
		departure.sendKeys("chennai");
		Actions action = new Actions(driver);
		action.keyDown(Keys.ENTER).perform();
		action.keyUp(Keys.ENTER).perform();
		driver.findElement(By.xpath("//span[@class='sc-12foipm-26 bIIzJX']/following-sibling::input"))
				.sendKeys("Bengaluru");
		action.keyDown(Keys.ENTER).perform();
		action.keyUp(Keys.ENTER).perform();
		driver.findElement(By.xpath("//span[text()='Return']/parent::div")).click();
		Date date = new Date();
		System.out.println(date);
		String[] d = date.toString().split(" ");
		String day = d[0];
		String month = d[1];
		String tdate = d[2];
		String year= d[5];
		String departureDate = day+" "+month+" "+tdate+" "+year;
		System.out.println(departureDate);
		
		//driver.quit();
		

	}

}
