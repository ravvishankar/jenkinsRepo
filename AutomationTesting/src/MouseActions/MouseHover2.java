package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement computersLink = driver.findElement(By.linkText("COMPUTERS"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		//Mousehover on computers link
		action.moveToElement(computersLink).perform();
		Thread.sleep(2000);
		
		//Click on notebook link
		WebElement notebooksLink = driver.findElement(By.linkText("Notebooks"));
		action.click(notebooksLink).perform();
		
		
	}

}
