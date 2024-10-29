package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardAction {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		action.keyDown(name, Keys.SHIFT).sendKeys("ravi shankar").perform();
		action.keyUp(name, Keys.SHIFT).perform();
		
		WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
		action.keyDown(Keys.SHIFT).sendKeys("raviSHANKAR2GMAIL");
		action.keyUp(email, Keys.SHIFT).perform();
		
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		action.keyDown(pwd, Keys.SHIFT).sendKeys("RAVI2!@#$").perform();
		action.keyUp(pwd, Keys.SHIFT).perform();
		driver.findElement(By.xpath("//input[@name='password']")).click();
//		driver.quit();
	}
		
}

