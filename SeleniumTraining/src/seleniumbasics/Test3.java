package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Absolute xpath
		driver.get("file:///C:/Users/ravis/OneDrive/Desktop/emp.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/input")).sendKeys("Qspiders");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Shankar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/input")).sendKeys("Ravi");
		driver.close();
		
		
		
		
		
		
	}

}
