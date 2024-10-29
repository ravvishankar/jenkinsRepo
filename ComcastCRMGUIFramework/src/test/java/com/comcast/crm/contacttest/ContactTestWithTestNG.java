package com.comcast.crm.contacttest;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.comcast.crm.basetest.BaseClass;


public class ContactTestWithTestNG extends BaseClass {
	@Test (groups = {"smokeTest" , "regressionTest"})
	public void createContactWithSupportDateTest() throws Exception {

		// Read data from the java utility class
		String actualDate = jlib.getSystemDate();
		String requiredDate = jlib.getRequiredDate(15);

		// Read testscript data from Excel file
		String contactName = eu.getDataFromExcel("contact", 1, 3);

//		Step-1: navigate to contact module
		driver.findElement(By.linkText("Contacts")).click();

//		Step-2: click on "create Contact" button
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

//		Step-3: Enter the details & create new Contact

		driver.findElement(By.name("lastname")).sendKeys(contactName);
		// driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[1]")).click();
		driver.findElement(By.name("support_start_date")).sendKeys(actualDate);
		driver.findElement(By.name("support_end_date")).sendKeys(requiredDate);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

//		Step-4: Verify the name as per the testscript data
		String actName = driver.findElement(By.id("dtlview_Last Name")).getText();
		if (actName.equals(contactName))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
	}

	@Test (groups = "regressionTest")
	public void createContactTest() throws InterruptedException, EncryptedDocumentException, IOException {

		// Read testscript data from Excel file
		String contactName = eu.getDataFromExcel("contact", 1, 3);
		String contactNo = eu.getDataFromExcel("contact", 1, 4);

//		Step-1: navigate to contact module
		driver.findElement(By.linkText("Contacts")).click();

//		Step-2: click on "create Contact" button
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();

//		Step-3: Enter the details & create new Contact

		driver.findElement(By.name("lastname")).sendKeys(contactName);
		// driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[1]")).click();
		driver.findElement(By.id("mobile")).sendKeys(contactNo);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(3000);

//		Step-5: Verify the contact info as per the testscript data
		String actHeader = driver.findElement(By.className("dvHeaderText")).getText();
		
		boolean status = actHeader.contains(contactName);
		Assert.assertEquals(status, true);
		
		String actLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actLastName, contactName);
		
	}

	@Test (groups ="regressionTest")
	public void createContactWithOrgNameTest() throws EncryptedDocumentException, IOException, InterruptedException {

		// Generate random numbers
		int randomInt = jlib.getRandomNumber();

		// Read testscript data from excel
		String orgName = eu.getDataFromExcel("contact", 1, 2) + randomInt;
		String lastName = eu.getDataFromExcel("contact", 1, 3);

//		Step-1: navigate to organization module
		driver.findElement(By.linkText("Organizations")).click();

//		Step-2: click on "create Organization" button
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();

//		Step-3: Enter the details & create new organization
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);

//		Step-4: navigate to "contact module"
		driver.findElement(By.linkText("Contacts")).click();

//		Step-5: click on "create Contact" button & Enter the details
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
		String parent = driver.getWindowHandle();

		// Switch to child window
		Set<String> window = driver.getWindowHandles();

		for (String childwindow : window) {
			driver.switchTo().window(childwindow);
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
		Thread.sleep(3000);

		// Step-7: Verify the contact info as per the testscript data
		String actName = driver.findElement(By.className("dvHeaderText")).getText();
		if (actName.contains(lastName))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");

	}
}
