package com.comcast.crm.orgtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.generic.databaseutility.DataBaseUtility;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.CreateNewProductPage;
import com.comcast.crm.objectrepositoryutility.CreateNewVendorsPage;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.ProductInfoPage;
import com.comcast.crm.objectrepositoryutility.ProductsPage;
import com.comcast.crm.objectrepositoryutility.VendorInfoPage;
import com.comcast.crm.objectrepositoryutility.VendorSearchPage;
import com.comcast.crm.objectrepositoryutility.VendorsPage;

public class CreateProductTestWithPom {

	public static void main(String[] args) throws IOException {

		// Create Object for Utility class
		FileUtility flib = new FileUtility();
		ExcelUtility elib = new ExcelUtility();
		DataBaseUtility dlib = new DataBaseUtility();
		JavaUtility jlib = new JavaUtility();
		WebDriverUtility wlib = new WebDriverUtility();
		
		// Read common data from .properties file
		String browser = flib.getDataFromPropertiesFile("browser");
		String url = flib.getDataFromPropertiesFile("url");
		String username = flib.getDataFromPropertiesFile("username");
		String password = flib.getDataFromPropertiesFile("password");
		
		//Random Numbers
		int randomNum = jlib.getRandomNumber();
		
		//Read testscript data from excel file
		String vendorName = elib.getDataFromExcel("practice", 13, 2)+ randomNum;
		String prodName = elib.getDataFromExcel("practice", 13, 3);
		String partialUrl = elib.getDataFromExcel("practice", 13, 4);
		
		WebDriver driver = null;
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else
			System.out.println("Invalid Browser");
		
		//Step-1: Login to Application
		driver.get(url);
		wlib.implicitWait(driver);
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(username, password);
		
		//Step-2: Navigate to Vendors link
		HomePage hp = new HomePage(driver);
		wlib.mouseMoveOnElement(driver, hp.getMorelink());
		hp.getVendors().click();
		
		//Step-3: Click on Create Vendor button
		VendorsPage ven = new VendorsPage(driver);
		ven.getCreateNewVendor().click();;
				
		
		//Step-4: Create new vendor name & click on save button
		CreateNewVendorsPage cnvp = new CreateNewVendorsPage(driver);
		cnvp.getVendorname().sendKeys(vendorName);
		cnvp.getSaveButton().click();
		
		// Verify Header Info Message
		VendorInfoPage vip = new VendorInfoPage(driver);
		String actualmsg = vip.getHeaderMsg().getText();
		if (actualmsg.contains(vendorName)){
			System.out.println(actualmsg + " = Test case pass");
		}
		else {
			System.out.println(actualmsg + " = Test case fail");
		}
		
		//Step-5: Click on Products link
		vip.getProductslink().click();
		
		//Step-6: Click on add Products button
		ProductsPage pp = new ProductsPage(driver);
		pp.getAddProductBtn().click();
		
		//Step-7: Enter all the details in create new product page
		CreateNewProductPage cnpp= new CreateNewProductPage(driver);
		cnpp.getProductname().sendKeys(prodName);
		String startDate = jlib.getSystemDate();
		String endDate = jlib.getRequiredDate(15);
		cnpp.getStartDate().sendKeys(startDate);
		cnpp.getEndDate().sendKeys(endDate);
		cnpp.getSelVendor().click();
		String parent = driver.getWindowHandle();
		
		//Step-7 Switch to child window
		wlib.switchToWindowOnUrl(driver, partialUrl);
		
		//Step-8: Enter the details and search for the vendor
		VendorSearchPage vsp = new VendorSearchPage(driver);
		vsp.getSearchField().sendKeys(vendorName);
		vsp.getSearchNowBtn().click();
		driver.findElement(By.xpath("//a[.='"+vendorName+"']")).click();
		driver.switchTo().window(parent);
		
		//Step-9: Upload a product image and click on save button in create new product page
		//cnpp.getProdImage().sendKeys("./resources/pictures/gulabjamun.jpg");
		cnpp.getSaveButton().click();
		
		//Step-10: Verify product is added or not
		ProductInfoPage pip = new ProductInfoPage(driver);
		String prodInfo = pip.getHeadermsg().getText();
		if (prodInfo.contains(prodName)){
			System.out.println("Product is created");
		}
		else {
			System.out.println("Product not created");
		}
		
		//Step-5: Logout
		hp.logOut();
		driver.quit();

	}

}
