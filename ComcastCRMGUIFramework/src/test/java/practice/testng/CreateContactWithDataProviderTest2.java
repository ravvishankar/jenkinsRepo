package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContactWithDataProviderTest2 {
	@Test (dataProvider = "getData")
	public void createContact(String firstName, String lastName, long phoneNumber) {
		System.out.println("FirstName: " + firstName + " LastName: " + lastName + " PhoneNumber: " +phoneNumber);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] objArr = new Object[4][3];
		objArr[0][0] = "Bhuvanesh";
		objArr[0][1] = "Ramesh";
		objArr[0][2] = 9876543210L;
		
		objArr[1][0] = "Leslie";
		objArr[1][1] = "Vibin";
		objArr[1][2] = 7854321065L;
		
		objArr[2][0] = "Muhesh";
		objArr[2][1] = "Balaji";
		objArr[2][2] = 6754321098L;
		
		objArr[3][0] = "Thanvir";
		objArr[3][1] = "Prasath";
		objArr[3][2] = 8765432109L;
		
		return objArr;
		

	}
}
