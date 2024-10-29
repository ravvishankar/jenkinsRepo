package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ravis/OneDrive/Desktop/loginpage.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Ravi Shankar");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ravi@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[3]")).click();
		driver.close();
		//driver.get("file:///C:/Users/ravis/OneDrive/Desktop/StudentPage.html");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("chennai");
		
	}

}
