package practice.assertion;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void homePageTest(Method mtd) {
		Reporter.log(mtd.getName() + " Test Begins");
		Reporter.log("Step-1");
		Reporter.log("Step-2");
		Reporter.log("Step-3");
		Reporter.log("Step-4");
		Reporter.log(mtd.getName() + " Test Ends");
	}

	@Test
	public void logoPageTest(Method mtd) {
		Reporter.log(mtd.getName() + " Test Begins");
		Reporter.log("Step-1");
		Reporter.log("Step-2");
		Reporter.log("Step-3");
		Reporter.log("Step-4");
		Reporter.log(mtd.getName() + " Test Ends");
	}

}
