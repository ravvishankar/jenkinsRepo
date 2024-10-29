package projectExecution;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
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
import org.openqa.selenium.support.ui.Select;

public class Login {
	public static void main(String[] args) throws IOException {

		// Fetch common data from the .properties file
		FileInputStream fis = new FileInputStream("C:\\Users\\ravis\\OneDrive\\Desktop\\Data\\commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String browser = pobj.getProperty("browser");
		String url = pobj.getProperty("url");
		String username = pobj.getProperty("username");
		String password = pobj.getProperty("password");
		
		WebDriver driver = null;
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")){
			driver = new FirefoxDriver();
		}
		else if (browser.equals("edge")){
			driver = new EdgeDriver();	
		}
		else
		System.out.println("Invalid Data");
		
		/*
		 * System.out.println(browser); System.out.println(url);
		 * System.out.println(username); System.out.println(password);
		 */
		Random rand = new Random();
		int randomInt = rand.nextInt(1000);

		// Fetch testscript data from excel sheet
		FileInputStream fis2 = new FileInputStream("C:\\Users\\ravis\\OneDrive\\Desktop\\Data\\testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(11);
		Cell cell = row.getCell(5);
		String logintype = cell.getStringCellValue();
		String pname = sh.getRow(14).getCell(5).getStringCellValue()+ randomInt ;
		String price = sh.getRow(15).getCell(5).getStringCellValue();
		String punit = sh.getRow(16).getCell(5).getStringCellValue();
		String pcategory = sh.getRow(17).getCell(5).getStringCellValue();
		String description = sh.getRow(19).getCell(5).getStringCellValue();
		
		//Write data back to excel
		/*Cell data = row.createCell(8);
		cell.setCellValue("fail");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ravis\\OneDrive\\Desktop\\data\\testscriptdata.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("********Executed***********");*/

		// Navigate to application
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("login:username")).sendKeys(username);
		driver.findElement(By.id("login:password")).sendKeys(password);

		// Login module
		WebElement dropdown = driver.findElement(By.id("login:type"));
		Select sel = new Select(dropdown);
		//System.out.println(sel.isMultiple()); // false
		dropdown.click();
		sel.selectByVisibleText(logintype);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[.='Add Products']")).click();

		// Add products module
		driver.findElement(By.id("product:name")).sendKeys(pname);
		driver.findElement(By.id("product:price")).sendKeys(price);
		WebElement unit = driver.findElement(By.id("product:unit"));
		unit.click();
		Select sel1 = new Select(unit);
		sel1.selectByVisibleText(punit);

		// Category dropdown
		WebElement category = driver.findElement(By.id("product:category"));
		category.click();
		Select sel2 = new Select(category);
		sel2.selectByVisibleText(pcategory);
		driver.findElement(By.name("rdbStock")).click();
		driver.findElement(By.id("product:description")).sendKeys(description);
		driver.findElement(By.xpath("//input[@value='Add Product']")).click();

		// Alert popup
		driver.switchTo().alert().accept();

	}

}
