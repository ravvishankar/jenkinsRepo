package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(2000);
	String placeholder = driver.findElement(By.id("email")).getAttribute("placeholder");
	System.out.println("Placeholder:"+placeholder);
	if (placeholder.equals("Enter Your Email"))
		System.out.println("Test case pass");
	else
		System.out.println("Test case failed");
	driver.quit();
	
	
		

	}

}
