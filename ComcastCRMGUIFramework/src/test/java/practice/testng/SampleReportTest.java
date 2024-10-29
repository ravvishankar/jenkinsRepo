package practice.testng;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReportTest {
	public ExtentReports report;

	@BeforeSuite
	public void configBS() {

		/* Report Configuration */
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html");
		spark.config().setDocumentTitle("CRM Test Suite Results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);

		/* Add Environment Info & Create Test */
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-11");
		report.setSystemInfo("Browser", "Chrome");

	}

	@AfterSuite
	public void configAS() {
		report.flush();

	}

	@Test
	public void createcontactTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://49.249.28.218:8888/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		String filePath=ts.getScreenshotAs(OutputType.BASE64);

		ExtentTest test = report.createTest("createcontactTest");

		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create contact");
		if ("HDFC".equals("HFDC")) {
			test.log(Status.PASS, "contact created");
		} else {
			test.addScreenCaptureFromBase64String(filePath, "ErrorFile");
		}
	}

	@Test
	public void createcontactWithOrg() {

		ExtentTest test = report.createTest("createcontactWithOrg");

		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create contact");
		if ("HDFC".equals("HFDC")) {
			test.log(Status.PASS, "contact created");
		} else {
			test.log(Status.FAIL, "contact not created");
		}
	}

	@Test
	public void createcontactWithPhoneNo() {

		ExtentTest test = report.createTest("createcontactWithPhoneNo");

		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create contact");
		if ("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "contact created");
		} else {
			test.log(Status.FAIL, "contact not created");
		}

	}
}
