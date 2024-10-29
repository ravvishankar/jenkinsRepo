package practice.testng;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test (priority = 1)
	public void createContactTest(){
		System.out.println("Executed createContact with---> HDFC");
	}
	
	@Test (priority = 2)
	public void modifyContactTest() {
		System.out.println("Executed modifyContact--->HDFC=>ICICI ");
	}
	
	@Test (priority = 3)
	public void deleteContactTest(){
		System.out.println("Executed deleteContact--->ICICI");
	}

}
