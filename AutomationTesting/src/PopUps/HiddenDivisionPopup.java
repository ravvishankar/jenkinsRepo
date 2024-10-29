package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[.='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Hidden division']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Name']/../..//input")).sendKeys("Ravi Shankar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("ravishankar7007@gmail.com");
		Thread.sleep(2000);
		WebElement product = driver.findElement(By.xpath("//label[.='Product']//following-sibling::div//select"));
		Select options = new Select(product);
		options.selectByVisibleText("Mobile");
		Thread.sleep(2000);
		
		
		
	}

}
