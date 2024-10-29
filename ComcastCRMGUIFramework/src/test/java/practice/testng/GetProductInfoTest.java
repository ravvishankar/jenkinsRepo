package practice.testng;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.crm.generic.fileutility.ExcelUtility;

public class GetProductInfoTest {
	@Test(dataProvider = "getData")
	public void getProductInfoTest(String brandName, String productName) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ref=nav_logo");

		// search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brandName + Keys.ENTER);

		// capture product info
		String iphonePrice = driver.findElement(By.xpath("//span[.='" + productName
				+ "']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']//span[@class='a-price-whole']"))
				.getText();
		System.out.println(brandName + " = " + iphonePrice);
		driver.quit();
	}

	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException {

		ExcelUtility elib = new ExcelUtility();
		int rowCount = elib.getRowCount("product");

		Object[][] objArr = new Object[rowCount][2];
		for (int i = 0; i < rowCount; i++) {
			objArr[i][0] = elib.getDataFromExcel("product", i + 1, 0);
			objArr[i][1] = elib.getDataFromExcel("product", i + 1, 1);
		}

		return objArr;

	}
}
