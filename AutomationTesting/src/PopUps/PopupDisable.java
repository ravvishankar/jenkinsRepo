package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupDisable {
	public static void main(String[] args) throws InterruptedException {
		
		//Step-1: Create an object of chromeoptions class
		ChromeOptions option = new ChromeOptions();
		
		//Step-2: Add arguments
		option.addArguments("--disable-notifications");
		
		//Step-3: Pass chromeoptions reference variable to chromedriver constructor
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		
	}

}
