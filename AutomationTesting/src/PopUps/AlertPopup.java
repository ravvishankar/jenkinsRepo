package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Javascript']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[@class='text-center pt-2']")));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Confirm")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		
		
	}

}
