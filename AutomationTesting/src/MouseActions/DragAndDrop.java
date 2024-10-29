package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement norway =driver.findElement(By.id("box101"));
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(oslo, norway).perform();
		Thread.sleep(1000);
		
		WebElement stockholm = driver.findElement(By.id("box2"));
		WebElement sweden =driver.findElement(By.id("box102"));
		mouse.dragAndDrop(stockholm, sweden).perform();
		Thread.sleep(1000);

		WebElement washington = driver.findElement(By.id("box3"));
		WebElement unitedstates =driver.findElement(By.id("box103"));
		mouse.dragAndDrop(washington, unitedstates).perform();
		Thread.sleep(1000);
		
		WebElement copenhagen = driver.findElement(By.id("box4"));
		WebElement denmark =driver.findElement(By.id("box104"));
		mouse.dragAndDrop(copenhagen, denmark).perform();
		Thread.sleep(1000);
		
		WebElement seoul = driver.findElement(By.id("box5"));
		WebElement southkorea =driver.findElement(By.id("box105"));
		mouse.dragAndDrop(seoul, southkorea).perform();
		Thread.sleep(1000);
		
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement italy =driver.findElement(By.id("box106"));
		mouse.dragAndDrop(rome, italy).perform();
		Thread.sleep(1000);
		
		WebElement madrid = driver.findElement(By.id("box7"));
		WebElement spain =driver.findElement(By.id("box107"));
		mouse.dragAndDrop(madrid, spain).perform();
		Thread.sleep(1000);




		
		
		
		
	}

}
