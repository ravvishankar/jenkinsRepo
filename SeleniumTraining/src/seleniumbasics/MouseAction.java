package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Mousehover on a webelement
		//WebElement element = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		//act.moveToElement(element).perform();
		
		//Contextclick
		//act.contextClick().perform();
		//act.contextClick(element).perform();
		
		//Drag & Drop
		/*WebElement src = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement dst = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement src1 = driver.findElement(By.xpath("//div[.='Laptop Charger']"));
		WebElement dst1 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		act.dragAndDrop(src, dst).perform();
		act.pause(2000).perform();
		act.dragAndDrop(src1, dst1).perform();*/
		
		//DoubleClick
		
		//act.doubleClick().perform();
		/*WebElement dc = driver.findElement(By.xpath("//button[@id='btn20']"));
		act.doubleClick(dc).perform();
		
		if (dc.getText().contains("Yes"))
			System.out.println("You selected \"Yes\"");
		else 
			System.out.println("You selected \"No\"");*/
		
		//ScrollToElement
		 /*WebElement insta = driver.findElement(By.xpath("//a[.='Instagram']"));
		 act.scrollToElement(insta).perform();
		 Point ref = insta.getLocation();
		 int x = ref.getX();
		 int y = ref.getY();
		 act.scrollByAmount(x, y);*/
		
		//Click & Hold
		/*WebElement hold = driver.findElement(By.id("circle"));
		act.clickAndHold(hold).pause(2000).release().build().perform();*/
		
		//SendKeys
		
		WebElement searchfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		act.sendKeys(searchfield, "Mobiles").perform();
		
		WebElement click = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		act.click(click).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
