package practice.testng;

import org.testng.annotations.Test;

public class OrderTest {
	
	@Test 
	public void createOrderTest() {
		System.out.println("Execute create order test =>123");
		String str = null;
		System.out.println(str.equals("123"));
	}
	
	@Test (dependsOnMethods = "createOrderTest")
	public void billingOrderTest() {
		System.out.println("Execute billing order test=>123");
	}

}
