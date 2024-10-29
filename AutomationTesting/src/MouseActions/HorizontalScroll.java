package MouseActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalScroll {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui/scroll/newTabHorizontal");
			Thread.sleep(2000);
			Actions mouse = new Actions(driver);
			mouse.scrollByAmount(2000, 0).perform();
			Thread.sleep(2000);
			mouse.scrollByAmount(2000, 0).perform();
			Thread.sleep(2000);
			mouse.scrollByAmount(4000, 0).perform();
			Thread.sleep(2000);
			mouse.scrollByAmount(-4000, 0).perform();
			Thread.sleep(2000);
			mouse.scrollByAmount(-4000, 0).perform();
			Thread.sleep(2000);
			
			
			

		
	}
	

}
