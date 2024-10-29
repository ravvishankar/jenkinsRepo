package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		//Maximize the Browser
		driver.manage().window().maximize();
		//Navigate to Url
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("email")).sendKeys("ravishankar7007@gmail.com");
		driver.findElement(By.id("password")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("password")).sendKeys("ravi123");	
		driver.findElement(By.name("btn_login")).submit();

	}

}
