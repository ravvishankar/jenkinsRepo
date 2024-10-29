package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollFromOrigin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(3000);
		WebElement contactus = driver.findElement(By.xpath("//a[.='Contact us']"));
		Actions mouse = new Actions(driver);
		ScrollOrigin origin =ScrollOrigin.fromElement(contactus);
		Thread.sleep(2000);
		mouse.scrollFromOrigin(origin, 0, 500).perform();
			
	}

}
