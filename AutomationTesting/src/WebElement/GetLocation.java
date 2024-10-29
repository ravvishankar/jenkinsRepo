package WebElement;

import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		//GetSize
		
		Dimension nameTf = driver.findElement(By.id("name")).getSize();
		int nameTfHeight = nameTf.getHeight();
		int nameTfWidth = nameTf.getWidth();
		System.out.println("NameTfDimension:"+nameTf);
		System.out.println("NameTfHeight:"+nameTfHeight);
		System.out.println("NameTfWidth:"+nameTfWidth);
		System.out.println("**************************");
		
		//GetLocation
		
		Point LocationTf = driver.findElement(By.id("name")).getLocation();
		Thread.sleep(2000);
		int TfX= LocationTf.getX();
		int TfY = LocationTf.getY();
		System.out.println("TfLocation:"+LocationTf);
		System.out.println("TfXPoint:"+TfX);
		System.out.println("TfXPoint:"+TfY);
		System.out.println("**************************");
		
		//GetRect
		
		//Rectangle Tfsize = driver.findElement(By.id("name")).getRect();
		//Dimension TfSize.getSize();
		//System.out.println("TfSize:"+TfSize);
		driver.quit();
		
		
		
		
		
		
	}

}
