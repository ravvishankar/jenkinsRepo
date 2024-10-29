package projectExecution;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneColor {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> allColour = driver.findElements(By.xpath(
				"//span[.='Apple iPhone 16 Plus (128 GB) - Ultramarine']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']//div[contains(@class,'a-section s-color-swatch-outer-circle s-color-swatch-pad')]//a"));
		for (WebElement colour : allColour) {
			System.out.println("Color : " + colour.getAttribute("aria-label"));
		}
		driver.quit();

	}
}
