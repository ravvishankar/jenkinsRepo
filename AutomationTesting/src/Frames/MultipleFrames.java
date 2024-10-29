package Frames;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Multiple iframe")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
