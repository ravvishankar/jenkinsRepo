package com.comcast.crm.orgtest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.comcast.crm.generic.databaseutility.DataBaseUtility;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.CampaignInfoPage;
import com.comcast.crm.objectrepositoryutility.CampaignPage;
import com.comcast.crm.objectrepositoryutility.CampaignSearchPage;
import com.comcast.crm.objectrepositoryutility.CreateNewCampaignPage;
import com.comcast.crm.objectrepositoryutility.CreateNewOpportunitiesPage;
import com.comcast.crm.objectrepositoryutility.HomePage;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.OpportunitiesInfoPage;
import com.comcast.crm.objectrepositoryutility.OpportunitiesPage;
import com.comcast.crm.objectrepositoryutility.OrganizationSearchPage;
import com.comcast.crm.objectrepositoryutility.ProductSearchPage;

public class CreateOpportunityTestWithPom {
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
		//int randomNum = jlib.getRandomNumber();
		
		//Read testscript data from excel file
		String orgName = elib.getDataFromExcel("practice", 16, 2);
		String prodName = elib.getDataFromExcel("practice", 16, 3);
		String productUrl = elib.getDataFromExcel("practice", 16, 4);
		String campaignName = elib.getDataFromExcel("practice", 16, 5);
		String opportunityName = elib.getDataFromExcel("practice", 16, 6);
		String orgUrl = elib.getDataFromExcel("practice", 16, 7);
		String campaignUrl = elib.getDataFromExcel("practice", 16, 8);
		
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
		
		//Step-2: Navigate to Campaign link
		HomePage hp = new HomePage(driver);
		wlib.mouseMoveOnElement(driver, hp.getMorelink());
		hp.getCampaignlink().click();
		
		//Step-3: Click on Create Campaign button
		CampaignPage cp = new CampaignPage(driver);
		cp.getAddCampaignBtn().click();
		
		//Step-4: Create new Campaign & click on save button
		CreateNewCampaignPage cncp= new CreateNewCampaignPage(driver);
		cncp.getCampaignName().sendKeys(campaignName);
		cncp.getSelectProduct().click();
		String parent = driver.getWindowHandle();
		
		//Step-5: Switch to child window
		wlib.switchToWindowOnUrl(driver, productUrl);
		
		//Step-6: Enter the details and search for the product
		ProductSearchPage psp = new ProductSearchPage(driver);
		psp.getProdSearchEdt().sendKeys(prodName);
		psp.getSearchBtn().click();
		psp.getProductName().click();
		driver.switchTo().window(parent);
		cncp.getSaveBtn().click();
		
		// Verify Header Info Message
		CampaignInfoPage cip = new CampaignInfoPage(driver);
		String actualmsg = cip.getHeaderMsg().getText();
		if (actualmsg.contains(campaignName)){
			System.out.println("Campaign is created");
		}
		else {
			System.out.println("Campaign not created");
		}
		
		//Step-7: Click on Opportunities link
		cip.getOpportunitiesLink().click();
		
		//Step-8: Click on create Opportunities button
		OpportunitiesPage op = new OpportunitiesPage(driver);
		op.getCreateOppurtunities().click();
		
		//Step-9: Click on create new Opportunities
		CreateNewOpportunitiesPage cnop = new CreateNewOpportunitiesPage(driver);
		cnop.getOpportunityName().sendKeys(opportunityName);
		String parent2 = driver.getWindowHandle();
		
		//Step-10 Enter Organization name and click on search
		cnop.getOrgName().click();
		wlib.switchToWindowOnUrl(driver, orgUrl);
		OrganizationSearchPage osp = new OrganizationSearchPage(driver);
		osp.getSearchBox().sendKeys(orgName);
		osp.getSearchBtn().click();
		osp.getOrgName().click();
		driver.switchTo().window(parent2);
		cnop.getOpportunityName().click();
		
		//Step-11: Enter Campaign name and click on search
		cnop.getCampaignName().click();
		wlib.switchToWindowOnUrl(driver, campaignUrl);
		CampaignSearchPage csp = new CampaignSearchPage(driver);
		csp.getCampaignsearchBox().sendKeys(campaignName);
		csp.getCampaignsearchBtn().click();
		csp.getCampaignName().click();
		driver.switchTo().window(parent2);
		cnop.getOpportunitySaveBtn().click();
		
		//Step-12: Verify Opportunity is created or not
		OpportunitiesInfoPage oip = new OpportunitiesInfoPage(driver);
		String opportunityHeaderMsg = oip.getOpportunityHeaderMsg().getText();
		if (opportunityHeaderMsg.contains(opportunityName)){
			System.out.println("Opportunity is created");
		}
		else {
			System.out.println("Opportunity is not created");
		}
		
		//Step-5: Logout
		hp.logOut();
		driver.quit();

	}
}



