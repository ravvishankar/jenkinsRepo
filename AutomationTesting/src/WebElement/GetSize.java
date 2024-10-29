package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.StandardSystemProperty;

public class GetSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		Dimension emailTfSize = driver.findElement(By.id("email")).getSize();
		int Height = emailTfSize.getHeight();
		int Width = emailTfSize.getWidth();
		System.out.println("emailTfSize:"+emailTfSize);
		System.out.println("emailTfHeight:"+Height);
		System.out.println("emailTfWidth:"+Width);
		System.out.println("****************************");
		
		Dimension pwdTfSize = driver.findElement(By.id("passContainer")).getSize();
		int Height1 = pwdTfSize.getHeight();
		int Width1 = pwdTfSize.getWidth();
		System.out.println("pwdTfSize:"+pwdTfSize);
		System.out.println("pwdTfHeight:"+Height1);
		System.out.println("pwdTfWidth:"+Width1);
		System.out.println("****************************");
		
		if (Height==Height1 && Width==Width1)
		{
			System.out.println("Test Case Pass");
		}
		else
			System.out.println("Test Case Fail");
		
		driver.quit();
		}	
	}

