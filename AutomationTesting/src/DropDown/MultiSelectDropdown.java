package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//p[.='UI Testing Concepts']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//section[.='Dropdown']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Multi Select")).click();
		Thread.sleep(3000);
		
		WebElement CountryDropdown = driver.findElement(By.xpath("//label[.='Country']/following-sibling::div/select"));
		Select SelectCountry = new Select(CountryDropdown);
		System.out.println("Is country dropdown is multi select : "+SelectCountry.isMultiple());
		SelectCountry.selectByIndex(0);
		Thread.sleep(2000);
		
		SelectCountry.selectByValue("Germany");
		Thread.sleep(2000);
		
		SelectCountry.selectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		
		SelectCountry.selectByValue("United Arab Emirates");
		Thread.sleep(2000);
		
		SelectCountry.selectByVisibleText("India");
		Thread.sleep(2000);
		
		//Deselect country Dropdown
		
		SelectCountry.deselectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		
		SelectCountry.deselectByValue("Germany");
		Thread.sleep(2000);
		
		SelectCountry.deselectAll();
		Thread.sleep(3000);
		
		WebElement StateDropdown = driver.findElement(By.xpath("//label[.='State']/following-sibling::div/select"));
		Select SelectState = new Select(StateDropdown);
		System.out.println("Is state dropdown is multi select : "+SelectState.isMultiple());
		SelectState.selectByVisibleText("Ontario");
		Thread.sleep(2000);
		
		SelectState.selectByValue("London");
		Thread.sleep(2000);
		
		SelectState.selectByValue("Dubai");
		Thread.sleep(2000);
		
		SelectState.selectByValue("Kerala");
		Thread.sleep(2000);
		
		SelectState.selectByValue("Karnataka");
		Thread.sleep(2000);
		
		SelectState.selectByValue("Goa");
		Thread.sleep(2000);
		
		SelectState.selectByValue("Pondicherry");
		Thread.sleep(2000);
		
		SelectState.selectByValue("Tamil Nadu");
		Thread.sleep(2000);
		
		//Deselect state dropdown
		SelectState.deselectByVisibleText("Ontario");
		Thread.sleep(2000);
		
		SelectState.deselectByValue("London");
		Thread.sleep(2000);
		
		SelectState.deselectByValue("Karnataka");
		Thread.sleep(2000);
		
		SelectState.deselectAll();
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
