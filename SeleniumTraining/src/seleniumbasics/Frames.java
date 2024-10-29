package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		WebElement element = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(element);
		driver.findElement(By.id("username")).sendKeys("Ravi");
		driver.findElement(By.id("password")).sendKeys("hello@1234",Keys.ENTER);
	}

}
