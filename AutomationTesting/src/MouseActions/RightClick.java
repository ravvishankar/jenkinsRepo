package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Right Click")).click();
		Thread.sleep(2000);
		WebElement rightclickButton1 = driver.findElement(By.id("btn30"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.contextClick(rightclickButton1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Yes']")).click();
		
		
		
		
		
			
	}

}
