package RobotClassPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotTest {
	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robo = new Robot();
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_R);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_S);
		robo.keyPress(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyPress(KeyEvent.VK_K);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_R);
		
		
		
		
		
		
		
		
		
	}

}
