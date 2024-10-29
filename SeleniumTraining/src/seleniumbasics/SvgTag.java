package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgTag {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nasa.gov/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@target='_blank']//*[name()='svg' and @alt='Facebook']")).click();

	}
}
