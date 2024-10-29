package vTiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FinalApplication {
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
		Sheet sh = wb.getSheet("contact");
		String orgName = sh.getRow(1).getCell(2).getStringCellValue() + randomInt;
		String lastName = sh.getRow(1).getCell(3).getStringCellValue();

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
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);

//		Step-5: navigate to "contact module"
		driver.findElement(By.linkText("Contacts")).click();

//		Step-6: click on "create Contact" button & Enter the details
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
		String parent = driver.getWindowHandle();

		// Switch to child window
		Set<String> window = driver.getWindowHandles();

		for (String childwindow : window) {
			driver.switchTo().window(childwindow);
			@Nullable
			String currentUrl = driver.getCurrentUrl();
			if (currentUrl.contains("Accounts&action")) {
				break;
			}	
		}
		driver.findElement(By.name("search_text")).sendKeys(orgName);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[.='" + orgName + "']")).click();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

	}
}