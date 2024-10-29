package pac2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.comcast.crm.basetest.BaseClass;
import com.comcast.crm.listenerutility.ListenerImplementationClass;

@Listeners(com.comcast.crm.listenerutility.ListenerImplementationClass.class)

public class OrgTestWithTestNGTest extends BaseClass {

	@Test (groups = "smokeTest")
	public void CreateOrgTest() throws EncryptedDocumentException, IOException {
		ListenerImplementationClass.test.log(Status.INFO, "Generate random numbers");

		// To Generate random numbers
		int randomInt = jlib.getRandomNumber();
		
		ListenerImplementationClass.test.log(Status.INFO, "Read data from excel");

		// Read testscript data from excel
		String orgName = eu.getDataFromExcel("practice", 4, 2) + randomInt;

		
//		Step-1: navigate to organization module
		ListenerImplementationClass.test.log(Status.INFO, "Navigate to Organization module");
		driver.findElement(By.linkText("Organizations")).click();

//		Step-2: click on "create Organization" button
		ListenerImplementationClass.test.log(Status.INFO, "Navigate to create organization page ");
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();

//		Step-3: Enter the details & create new organization
		ListenerImplementationClass.test.log(Status.INFO, "Create the organization");
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		ListenerImplementationClass.test.log(Status.INFO, orgName + " Organization created");

//		Step-4: Verify Header message
		String headerinfo = driver.findElement(By.className("dvHeaderText")).getText();
		if (headerinfo.contains(orgName)) {
			System.out.println(orgName + " is created & Test case pass");
		} else
			System.out.println(orgName + " is not created Test case fail");

	}

	@Test(groups = "regressionTest")
	public void CreateOrgWithPhoneNo() throws EncryptedDocumentException, IOException {

		// To Generate random numbers
		int randomInt = jlib.getRandomNumber();

		// Read testscript data from excel
		String orgName = eu.getDataFromExcel("practice", 4, 2) + randomInt;
		String contactNo = eu.getDataFromExcel("practice", 4, 5);

//		Step-1: navigate to organization module
		driver.findElement(By.linkText("Organizations")).click();

//		Step-2: click on "create Organization" button
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();

//		Step-3: Enter the details & create new organization
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.id("phone")).sendKeys(contactNo);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

//		Step-4: Verify Header message
		String headerinfo = driver.findElement(By.className("dvHeaderText")).getText();
		if (headerinfo.contains(orgName)) {
			System.out.println(orgName + " is created & Test case pass");
		} else
			System.out.println(orgName + " is not created Test case fail");

	}

	@Test(groups = "regressionTest")
	public void CreateOrgWithIndustryType() throws EncryptedDocumentException, IOException {

		// To Generate random numbers
		int randomInt = jlib.getRandomNumber();

		// Read testscript data from excel
		String orgname = eu.getDataFromExcel("practice", 4, 2) + randomInt;
		String industry = eu.getDataFromExcel("practice", 4, 3);

//		Step-1: navigate to organization module
		driver.findElement(By.linkText("Organizations")).click();

//		Step-2: click on "create Organization" button
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();

//		Step-3: Enter the details & create new organization
		driver.findElement(By.name("accountname")).sendKeys(orgname);

		// Select Industry from the dropdown
		WebElement dropdown = driver.findElement(By.name("industry"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(industry);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

// 		Step-4: Verify Industry dropdown name

		String actualindustry = driver.findElement(By.id("dtlview_Industry")).getText();
		if (actualindustry.equals(industry))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");

	}

}
