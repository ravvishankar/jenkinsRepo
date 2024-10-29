package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement countryDropdown = driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));
		Select selectCountry = new Select(countryDropdown);
		System.out.println("Is country dropdown is multiselect:" + selectCountry.isMultiple());
		
	//Select Country dropdown
		
		selectCountry.selectByIndex(0);
		Thread.sleep(2000);
		selectCountry.selectByIndex(1);
		Thread.sleep(2000);
		selectCountry.selectByValue("India");
		Thread.sleep(2000);
		selectCountry.selectByValue("Poland");
		Thread.sleep(2000);
		selectCountry.selectByVisibleText("China");
		Thread.sleep(2000);
		selectCountry.selectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		
	//Deselect countrydropdown

		selectCountry.deselectByIndex(1);
		Thread.sleep(1000);
		selectCountry.deselectByValue("United Kingdom");
		Thread.sleep(1000);
		selectCountry.deselectByVisibleText("China");
		Thread.sleep(1000);
		selectCountry.deselectAll();
		
	//Select state dropdown
		
		WebElement stateDropdown = driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[2]"));
		Select selectState = new Select(stateDropdown);
		System.out.println("Is state dropdown is multiselect:" + selectState.isMultiple());
		selectState.selectByIndex(0);
		Thread.sleep(1000);
		selectState.selectByIndex(2);
		Thread.sleep(1000);
		selectState.selectByIndex(4);
		Thread.sleep(1000);
		selectState.selectByValue("Kerala");
		Thread.sleep(1000);
		selectState.selectByValue("Goa");
		Thread.sleep(1000);
		selectState.selectByVisibleText("Delhi");
		Thread.sleep(1000);
		selectState.selectByVisibleText("Tamil Nadu");
		Thread.sleep(1000);
		
	//Deselect statedropdown
		
		selectState.deselectByIndex(4);
		Thread.sleep(1000);
		selectState.deselectByIndex(0);
		Thread.sleep(1000);
		selectState.deselectByValue("Delhi");
		Thread.sleep(1000);
		selectState.deselectAll();
		Thread.sleep(1000);
		driver.quit();	
	}

}
