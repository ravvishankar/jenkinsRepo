package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		//Click on Ui Testing Concepts
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		//Click on checkbox
		driver.findElement(By.xpath("//section[.='Check Box']")).click();
		Thread.sleep(2000);
		//Verify email checkbox is enabled or disabled
		boolean emailCheckBox=driver.findElement(By.id("domain1")).isEnabled();
		Thread.sleep(2000);
		System.out.println(emailCheckBox);
		//Click on disabled
		driver.findElement(By.linkText("Disabled")).click();
		Thread.sleep(2000);
		boolean emailCheckBox1=driver.findElement(By.id("domain1")).isEnabled();
		Thread.sleep(2000);
		System.out.println(emailCheckBox1);
		driver.quit();
		
		
		
		
		
		
		

	}

}
