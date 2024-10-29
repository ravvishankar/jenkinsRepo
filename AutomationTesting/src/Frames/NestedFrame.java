package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
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
		driver.findElement(By.linkText("Nested iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		String email = driver.findElement(By.xpath("(//p[@class=\"para\"])[1]")).getText();
		String password = driver.findElement(By.xpath("(//p[@class=\"para\"])[2]")).getText();
		String confirmPassword = driver.findElement(By.xpath("(//p[@class=\"para\"])[3]")).getText();
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("confirm-password")).sendKeys(confirmPassword);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Nested with Multiple iframe")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		 
		
		
		
		}

}
