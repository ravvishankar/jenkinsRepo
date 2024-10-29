package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(2000);
		//Relative xpath
		//driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		//driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		//driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Mobiles");
		
		//Text attribute - Relative xpath
		
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Log in']")).click(); 
		
		//Contains method - Relative xpath (To ignore empty spaces / white spaces)
		//driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click(); //1st type
		//driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("Mobiles"); //2nd type
		
		//Starts with method
		//driver.findElement(By.xpath("(//a[starts-with(text(),'Electron')])[1]")).click();
		//driver.findElement(By.xpath("//input[contains(@value,'Subscribe')]")).click();
		
		//Ends with method
		//driver.findElement(By.xpath("//input[ends-with(@name,'Email')]")) // (It doesn't work most of the times)
		
		//Relative xpath with combination of AN & AV (and, or)
		
		//driver.findElement(By.xpath("//input[@type='button' and  @id='vote-poll-1']")).click();
		//driver.findElement(By.xpath("//span[@class='cartlabel' or text()='Shopping cart']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
