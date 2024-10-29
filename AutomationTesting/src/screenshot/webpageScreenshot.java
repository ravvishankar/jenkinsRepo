package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webpageScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		
//		Step 1: Convert the webdriver reference into takes screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		
//		Step 2: Call getscreenshotAs() to take webpage screenshot
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
//		Step3: Create a permanent file location
		File permanent=new File("./Screenshots/"+gettime()+"photo.png");
		
//		Copy the screenshot from temp to permanent
		FileHandler.copy(temp, permanent);
		
		driver.quit();
	}
	
	public static String gettime() {
		return LocalDateTime.now().toString().replace("-", "_").replace(":", "_");

	}
}


