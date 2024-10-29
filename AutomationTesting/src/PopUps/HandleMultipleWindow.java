package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[.='Browser Windows']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("browserButton3")).click();
		Thread.sleep(3000);
		Set<String> allwindows = driver.getWindowHandles();
		for(String window:allwindows) {
			driver.switchTo().window(window);
			String url = driver.getCurrentUrl();
			Thread.sleep(1000);
			if(url.equals("https://demoapps.qspiders.com/ui/browser/SignUp")){
				break;
			}
		}
		public static void SwitchToWindowByUrl(WebDriver driver, String expectedUrl){
			allwindows=driver.getWindowHandles();
		}
		
	}

}
