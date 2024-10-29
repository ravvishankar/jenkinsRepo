package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webelementScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		
		File temp = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).getScreenshotAs(OutputType.FILE);
		File permanent=new File("./Screenshots/"+webpageScreenshot.gettime()+".png");
		FileHandler.copy(temp, permanent);
		
	}

}
