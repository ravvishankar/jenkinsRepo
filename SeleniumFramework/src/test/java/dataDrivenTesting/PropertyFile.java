package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFile {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\ravis\\OneDrive\\Desktop\\commandata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String browser = pobj.getProperty("browser");
		String url = pobj.getProperty("url");
		String uname = pobj.getProperty("username");
		String pwd = pobj.getProperty("password");
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the Browser");
		 * String browser1 = sc.next();
		 */
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
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("user_name")).sendKeys(uname);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.quit();

	}

}
