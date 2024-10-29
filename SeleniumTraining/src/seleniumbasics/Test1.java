package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.co.in");
		//driver.close();
		driver.quit();

	}

}
