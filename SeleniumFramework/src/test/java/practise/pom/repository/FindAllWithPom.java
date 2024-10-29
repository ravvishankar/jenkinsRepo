package practise.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FindAllWithPom{

		@FindBy(name = "user_name")
		WebElement ele1;

		@FindBy(name = "user_password")
		WebElement ele2;

		@FindAll({@FindBy(id="submit"),@FindBy(xpath="//input[@value='Login']")})
		WebElement ele3;

		@Test
		public void sampleTest() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://106.51.90.215:8888/");

			FindAllWithPom s = PageFactory.initElements(driver, FindAllWithPom.class);
			s.ele1.sendKeys("admin");
			s.ele2.sendKeys("admin");
			s.ele3.click();

		}

	}

