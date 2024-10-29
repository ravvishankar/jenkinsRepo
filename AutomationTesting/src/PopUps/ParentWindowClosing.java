package PopUps;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentWindowClosing {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[.='Sign in with Google']"));
	    Set<String> allwindows = driver.getWindowHandles();
	    for(String window: allwindows){
	    	drivr
	    }
	    	
	    	
//		driver.findElement(By.id("identifierId")).sendKeys("ravishankar7007@gmail.com);
		
		
		
		
		
	}

}
