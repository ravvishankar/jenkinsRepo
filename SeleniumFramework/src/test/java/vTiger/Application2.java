package vTiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Application2{
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
		Row row = sh.getRow(1);
		Cell cell = row.getCell(2);
		String contactName = cell.getStringCellValue() + randomInt;

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
		
		Date date = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		String actualDate = sim.format(date);
		
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,30);
		String requiredDate = sim.format(cal.getTime());

		driver.findElement(By.name("lastname")).sendKeys(contactName);
		//driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[1]")).click();
		driver.findElement(By.name("support_start_date")).sendKeys(actualDate);
		driver.findElement(By.name("support_end_date")).sendKeys(requiredDate);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
//		Step-5: Verify the name as per the testscript data
		String actName = driver.findElement(By.id("dtlview_Last Name")).getText();
		if (actName.equals(contactName))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");

	}
}
