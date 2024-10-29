package RobotClassPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotTest1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(2000);
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CAPS_LOCK);
		robo.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		robo.keyPress(KeyEvent.VK_Y);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_U);
		
		robo.keyPress(KeyEvent.VK_CAPS_LOCK);
		robo.keyRelease(KeyEvent.VK_CAPS_LOCK);
		
		robo.keyPress(KeyEvent.VK_T);
		robo.keyPress(KeyEvent.VK_U);
		robo.keyPress(KeyEvent.VK_B);
		robo.keyPress(KeyEvent.VK_E);		
		
	}

}
