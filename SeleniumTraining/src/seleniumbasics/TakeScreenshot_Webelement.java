package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot_Webelement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchfield = driver.findElement(By.id("small-searchterms"));
		searchfield.sendKeys("Mobiles");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = searchfield.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/Searchtxtfield.png");
		FileHandler.copy(src, dest);

		System.out.println("Screenshot on search textfield is successfull");
		driver.close();

	}
}
