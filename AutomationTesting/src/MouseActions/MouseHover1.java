package MouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;	

public class MouseHover1 {
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Mouse Hover']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Ratings")).click();
		Thread.sleep(2000);
		List<WebElement> allStar = driver.findElements(By.xpath("//input[@name='radio']/.."));
		Actions action = new Actions(driver);
		driver.manage().window().fullscreen();
		while(true)
		{
			for(WebElement star: allStar)
		{
		action.moveToElement(star).perform();
		Thread.sleep(500);
		}
		for(int i= allStar.size()-1;i>=0;i--)
		{
			action.moveToElement(allStar.get(i));
			Thread.sleep(500);
		}
		}
		
		
		
	}

}
