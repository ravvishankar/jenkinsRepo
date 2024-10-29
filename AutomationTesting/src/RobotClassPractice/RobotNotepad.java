package RobotClassPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotNotepad {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(2000);
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CAPS_LOCK);
		robo.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robo.keyPress(KeyEvent.VK_G);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyRelease(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyPress(KeyEvent.VK_SPACE);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_F);
		robo.keyPress(KeyEvent.VK_T);
		robo.keyPress(KeyEvent.VK_E);Ś
		robo.keyPress(KeyEvent.VK_R);
		robo.keyPress(KeyEvent.VK_N);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyRelease(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_S);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_B);Ś
		robo.keyPress(KeyEvent.VK_BŚ);Ś
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyPress(KeyEvent.VK_ALT);
		robo.keyPress(KeyEvent.VK_F4);
		
	}

}
