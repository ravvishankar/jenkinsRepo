package RobotClassPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotTest2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			Thread.sleep(2000);
			driver.findElement(By.id("name")).click();
			Robot robo = new Robot();
			
			robo.keyPress(KeyEvent.VK_R);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyPress(KeyEvent.VK_V);
			robo.keyPress(KeyEvent.VK_I);
			robo.keyPress(KeyEvent.VK_S);
			robo.keyPress(KeyEvent.VK_H);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyPress(KeyEvent.VK_N);
			robo.keyPress(KeyEvent.VK_K);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyPress(KeyEvent.VK_R);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyPress(KeyEvent.VK_C);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_TAB);
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			
			
			
			
			
		
	}

}
