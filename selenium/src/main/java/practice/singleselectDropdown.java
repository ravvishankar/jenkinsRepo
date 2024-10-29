package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		Thread.sleep(2000);
		Select selectcountry = new Select(driver.findElement(By.id("select3")));
		selectcountry.selectByIndex(7);
		Thread.sleep(2000);
		Select selectstate = new Select(driver.findElement(By.id("select5")));
		selectstate.selectByValue("Tamil Nadu");
		Thread.sleep(2000);
		Select selectcity = new Select(driver.findElement(By.xpath("//label[.='City']/../select")));
		selectcity.selectByVisibleText("Chennai");
		driver.quit();
		
	}

}



