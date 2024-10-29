package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		String text = driver.findElement(By.xpath("//a[@href=\"https://www.irctc.com/empanelment.html\"]")).getText();
		System.out.println(text);
		if(text.equals("Please click here for Empanelment for PAD items for Catering."))
		{
			System.out.println("Test case pass");
		}
		else
			System.out.println("Test case Fail");
		
	}

}
