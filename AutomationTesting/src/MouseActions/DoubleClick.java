package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[.='Button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Double Click")).click();
		Thread.sleep(3000);
		WebElement yesButton = driver.findElement(By.id("btn20"));
		Actions action = new Actions(driver);
		action.doubleClick(yesButton).perform();
		Thread.sleep(3000);
		String Textmsg =driver.findElement(By.xpath("//span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']")).getText();
		String ActualResult = Textmsg;
		String ExpectedResult = "You selected \"Yes\"";
		System.out.println("Actual Result:"+ActualResult);
		System.out.println("Expected Result:"+ExpectedResult);
		
		if (ActualResult.equals(ExpectedResult))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");	
	}

}
