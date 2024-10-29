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
import com.comcast.crm.objectrepositoryutility.CreateNewOrganizationPage;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.OrganizationInfoPage;
import com.comcast.crm.objectrepositoryutility.OrganizationPage;

public class DeleteOrgTestWithPom {

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
		int randomNum=jlib.getRandomNumber();
		
		//Read testscript data from excel file
		String orgName = elib.getDataFromExcel("practice",10,2)+randomNum;
		String txt = elib.getDataFromExcel("practice",10,3);
		//String industry = elib.getDataFromExcel("practice", 4, 3);
		
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
		
		//Step-2: Navigate to Organisation module
		HomePage hp = new HomePage(driver);
		hp.getOrglink().click();
		
		//Step-3: Click on Create Organisation button
		OrganizationPage op = new OrganizationPage(driver);
		op.getOrgButton().click();
		
		//Step-4: Enter all the details & Create new organisation
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.createOrg(orgName);
		
		// Verify Header Info Message
		OrganizationInfoPage oip= new OrganizationInfoPage(driver);
		String actualmsg = oip.getHeaderInfo().getText();
		if (actualmsg.contains(orgName)){
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
		
		//Go back to Organisation page
			hp.getOrglink().click();
			
		//Search for Organisation
			op.getSearchTxt().sendKeys(orgName);
			op.orgoption(txt);
			op.getSearchButton().click();
			
		//In Dynamic webtable Select & Delete Org
			driver.findElement(By.xpath("//a[.='"+orgName+"' and @title='Organizations']/../..//a[.='del']")).click();
			wlib.switchToAlertAndAccept(driver);
		
		//Step-5: Logout
		
		hp.logOut();
		driver.quit();

	}

}
