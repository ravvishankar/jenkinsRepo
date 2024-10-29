package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		Thread.sleep(2000);
	
		
		WebElement countryDropdown = driver.findElement(By.id("select3"));
		Thread.sleep(2000);
		Select selectCountry = new Select(countryDropdown);
		System.out.println(selectCountry.isMultiple());
		selectCountry.selectByIndex(7);
		
		WebElement stateDropdown = driver.findElement(By.id("select5"));
		Thread.sleep(5000);
		Select selectState = new Select(stateDropdown);
		System.out.println(selectState.isMultiple());
		selectState.selectByValue("Tamil Nadu");
		
		WebElement cityDropdown = driver.findElement(By.xpath("//label[.='City']/../select"));
		Thread.sleep(2000);
		Select selectCity = new Select(cityDropdown);
		System.out.println(selectCity.isMultiple());
		selectCity.selectByVisibleText("Chennai");
		
		//driver.quit();
		
		
		
		
	}

}
