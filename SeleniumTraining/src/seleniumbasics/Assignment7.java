package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment7 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Shankar");
		driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ravishankar7007@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@type='radio' and @value='Male']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Movies']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Hockey']")).click();
		driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys("English");
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select = new Select(skills);
		System.out.println("isMultiple: "+select.isMultiple());
		select.selectByIndex(39);
		
		
		
		
		

	}

}
