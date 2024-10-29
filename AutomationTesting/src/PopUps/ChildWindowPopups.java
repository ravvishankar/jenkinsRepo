package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWindowPopups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ref = driver.findElement(By.xpath("//a[@id='men']"));
		Actions action = new Actions(driver);
		action.moveToElement(ref).pause(Duration.ofSeconds(2)).perform();
		driver.findElement(By.xpath("//a[.='T-shirts']")).click();
		driver.findElement(By.xpath("//span[.='puma']")).click();
		driver.findElement(By.id("compare")).click();
		String parent = driver.getWindowHandle();	
		System.out.println(parent);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("Total number of windows:"+allwindows.size());
		for(String window:allwindows) {
			driver.switchTo().window(window);
			String title = driver.getTitle();
			if (title.contains("ShoppersStack"))
			{
				continue;
			}
			else {
				driver.close();
				Thread.sleep(1000);	
			}
		}
	}
}