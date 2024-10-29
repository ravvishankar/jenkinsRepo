package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCss {
		public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		String backGround = driver.findElement(By.xpath("//a[.=' Try booking in Ask DISHA 2.0 ']")).getCssValue("background");
		System.out.println("Background Colour:"+backGround);
		
	}

}
