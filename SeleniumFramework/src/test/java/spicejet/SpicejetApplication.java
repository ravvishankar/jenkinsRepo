package spicejet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpicejetApplication {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*driver.findElement(By.xpath("//div[.='round trip']")).click();
		driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']"))
				.sendKeys("maa");
		driver.findElement(By.xpath("//input[@value='Select Destination']")).sendKeys("del");
		driver.findElement(By.xpath("//div[.='20']")).click();
		driver.findElement(By.xpath("//div[.='25']")).click();
		driver.findElement(By.xpath("//div[.='Search Flight' and @class='css-76zvg2 r-jwli3a r-1i10wst r-1kfrs79']"))
				.click();*/

	}

}
