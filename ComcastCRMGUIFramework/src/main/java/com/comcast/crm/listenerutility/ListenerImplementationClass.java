package com.comcast.crm.listenerutility;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.basetest.BaseClass;

public class ListenerImplementationClass implements ITestListener, ISuiteListener {
	public static  ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Report configuration");
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

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Report Backup");
		report.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("==Starts==" + result.getMethod().getMethodName() + "==Starts==");
		test = report.createTest(result.getMethod().getMethodName());
		test.log(Status.INFO, result.getMethod().getMethodName() + " " + "====Started====");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("==Ends==" + result.getMethod().getMethodName() + "==Ends==");
		test.log(Status.PASS, result.getMethod().getMethodName() + " " + "====Completed====");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		// Step-1: create an object for EventFiring webdriver
		// EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sdriver);

		// Step-2: use getScreenshotAs method to get file type of screenshot
		// File srcFile = edriver.getScreenshotAs(OutputType.FILE);

		TakesScreenshot ts = (TakesScreenshot) BaseClass.sdriver;
		String filePath = ts.getScreenshotAs(OutputType.BASE64);
		String time = new java.util.Date().toString().replace(" ", "_").replace(":", "_");
		test.addScreenCaptureFromBase64String(filePath, testName + " " + time);
		test.log(Status.FAIL, result.getMethod().getMethodName() + " " + "====Failed====");

		// Step-3: Store screenShot on local driver
		/*
		 * try { FileUtils.copyFile(srcFile, new File("./screenshot/"+testName+
		 * "+"+time+".png")); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */
	}
}
