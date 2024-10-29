package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContactWithDataProviderTest {
	@Test (dataProvider = "getData")
	public void createContact(String firstName, String lastName) {
		System.out.println("FirstName: " + firstName + " LastName: " + lastName);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] objArr = new Object[4][2];
		objArr[0][0] = "Bhuvanesh";
		objArr[0][1] = "Ramesh";
		
		objArr[1][0] = "Leslie";
		objArr[1][1] = "Vibin";
		
		objArr[2][0] = "Muhesh";
		objArr[2][1] = "Balaji";
		
		objArr[3][0] = "Thanvir";
		objArr[3][1] = "Prasath";
		
		return objArr;
		

	}
}
