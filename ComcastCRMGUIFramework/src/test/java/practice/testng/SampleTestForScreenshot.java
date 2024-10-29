package practice.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.Test;

public class SampleTestForScreenshot {
	@Test

	public void screenshotTest() throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// Step-1: create an object for EventFiring webdriver
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);

		// Step-2: use getScreenshotAs method to get file type of screenshot
		File srcFile = edriver.getScreenshotAs(OutputType.FILE);

		// Step-3: Store screenShot on local driver
		FileUtils.copyFile(srcFile, new File("./screenshot/test.png"));

	}

}
