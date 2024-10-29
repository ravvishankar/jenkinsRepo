package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PopUps.AlertPopup;

public class explicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section[.='Popups']")));
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[.='Javascript']")));
		driver.findElement(By.xpath("//section[.='Javascript']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("buttonAlert2")));
		driver.findElement(By.id("buttonAlert2")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
