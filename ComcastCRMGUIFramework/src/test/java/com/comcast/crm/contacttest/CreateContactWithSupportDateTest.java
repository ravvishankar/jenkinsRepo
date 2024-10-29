package com.comcast.crm.contacttest;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;

public class CreateContactWithSupportDateTest {
	public static void main(String[] args) throws IOException, InterruptedException {

		// Create object for "File utility" class (Read data from .properties file)
		FileUtility ref = new FileUtility();
		String browser = ref.getDataFromPropertiesFile("browser");
		String url = ref.getDataFromPropertiesFile("url");
		String username = ref.getDataFromPropertiesFile("username");
		String password = ref.getDataFromPropertiesFile("password");

		// Create object for "Java utility" class
		JavaUtility jlib = new JavaUtility();
		String actualDate = jlib.getSystemDate();
		String requiredDate = jlib.getRequiredDate(15);

		// Create object for "Excel utility" class (Read data from excel)
		ExcelUtility eu = new ExcelUtility();
		String contactName = eu.getDataFromExcel("contact", 1, 3);

		WebDriver driver = null;
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else
			System.out.println("Invalid Data");

//		Step-1: login to application
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();

//		Step-2: navigate to contact module
		driver.findElement(By.linkText("Contacts")).click();

//		Step-3: click on "create Contact" button
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

//		Step-4: Enter the details & create new Contact

		driver.findElement(By.name("lastname")).sendKeys(contactName);
		// driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[1]")).click();
		driver.findElement(By.name("support_start_date")).sendKeys(actualDate);
		driver.findElement(By.name("support_end_date")).sendKeys(requiredDate);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

//		Step-5: Verify the name as per the testscript data
		String actName = driver.findElement(By.id("dtlview_Last Name")).getText();
		if (actName.contains(contactName))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");

	}
}
