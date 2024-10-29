package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		/*
		 * driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		 * Thread.sleep(1000); driver.findElement(By.id("small-searchterms")).clear();
		 * Thread.sleep(1000);
		 * driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//input[@type='submit']")).submit();
		 */

		// WebElement Getters

		/*String text = driver.findElement(By.linkText("Register")).getText();
		System.out.println(text);
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		String searchpage_text = driver.findElement(By.xpath("//h1[text()='Search']")).getText();
		System.out.println("Text Displayed is " + searchpage_text);
		Thread.sleep(1000);*/
		String subscribe_value = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).getAttribute("value");
		System.out.println(subscribe_value);

	}
}
