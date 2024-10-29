package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		//Typecasting
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Temporary location
		File srcfile =ts.getScreenshotAs(OutputType.FILE);
		
		//Destination file
		File destfile = new File("./ScreenShots/HomePage.png");
		
		FileHandler.copy(srcfile,destfile);
		
		System.out.println("HomePage launched sucessfully");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/SearchPage.png");
		FileHandler.copy(src, dest);
		
		driver.close();
		
		
	}

}
