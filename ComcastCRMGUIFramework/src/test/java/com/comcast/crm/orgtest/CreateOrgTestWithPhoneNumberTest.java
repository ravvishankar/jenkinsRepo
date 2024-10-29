package com.comcast.crm.orgtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateOrgTestWithPhoneNumberTest {
	public static void main(String[] args) throws IOException, InterruptedException {

		// Read common data from .properties file
		FileInputStream fis = new FileInputStream("C:\\Users\\ravis\\OneDrive\\Desktop\\Data1\\commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String browser = pobj.getProperty("browser");
		String url = pobj.getProperty("url");
		String username = pobj.getProperty("username");
		String password = pobj.getProperty("password");

		// To Generate random numbers
		Random rand = new Random();
		int randomInt = rand.nextInt(1000);

		// Read testscript data from excel
		FileInputStream fis1 = new FileInputStream("C:\\Users\\ravis\\OneDrive\\Desktop\\Data1\\testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet("practice");
		Row row = sh.getRow(4);
		Cell cell = row.getCell(2);
		String orgname = cell.getStringCellValue() + randomInt;
		String industry = row.getCell(3).toString();
		String type = row.getCell(4).toString();
		String contact = row.getCell(5).toString();

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

//		Step-2: navigate to organization module
		driver.findElement(By.linkText("Organizations")).click();

//		Step-3: click on "create Organization" button
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();

//		Step-4: Enter the details & create new organization
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		driver.findElement(By.id("phone")).sendKeys(contact);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		// Thread.sleep(2000);
		// driver.switchTo().alert().accept();

		
//		Step-5: Verify Header message
		String headerinfo = driver.findElement(By.className("dvHeaderText")).getText();
		if (headerinfo.contains(orgname)) {
			System.out.println(orgname + " is created & Test case pass");
		} else
			System.out.println(orgname + " is not created Test case fail");

//		Step-6: logout
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		driver.quit();
	}

}
