package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ravi");
		driver.findElement(By.id("LastName")).sendKeys("Shankar");
		driver.findElement(By.name("Email")).sendKeys("ravi0508@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ravi@1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ravi@1234");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	}

}
