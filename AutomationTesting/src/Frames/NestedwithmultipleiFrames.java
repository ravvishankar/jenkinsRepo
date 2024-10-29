package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedwithmultipleiFrames {
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
		driver.findElement(By.linkText("Nested with Multiple iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
//		String email =driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
//		String pwd=driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
//		String cpwd=driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		String login =driver.findElement(By.xpath("//h2[.='Login']")).getText();
	System.out.println(login);
	driver.quit();
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ravi");
//		driver.findElement(By.id("password")).sendKeys();
//		driver.findElement(By.id("confirm")).sendKeys(cpwd);
	}
}
