package ObjectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WelcomePage wp = new WelcomePage(driver);
	wp.getRegisterLink().click();
	
	RegisterPage rp = new RegisterPage(driver);
	rp.getMaleGenderButton().click();
	
	//Enter First name
	rp.getFirstNameTextField().sendKeys("Ravi");
	
	//Enter Last name
	rp.getLastNameTextField().sendKeys("Shankar");
	
	//Enter Email
	rp.getEmailTextField().sendKeys("ravishankar1234@gmail.com");
	
	//Enter Password
	rp.getPasswordTextField().sendKeys("abcd@1234");
	
	//Enter confirm password
	rp.getConfirmPasswordTextField().sendKeys("abcd@1234");
	
	//Click on register button
	rp.getRegisterButton().click();
	
	Thread.sleep(5000);
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	}
}
