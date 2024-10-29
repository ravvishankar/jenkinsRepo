package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PracticeDataDrivenTesting {
	public static void main(String[] args) throws IOException{
		
		//Step-1 Get the java representation object of physical file
		FileInputStream fis = new FileInputStream("C:\\Users\\ravis\\OneDrive\\Desktop\\commandata.properties");
		
		//Step-2 Using Proprties class, Load all the keys
		Properties pobj = new Properties();
		pobj.load(fis);
		
		//Step-3 Get the value based on key
		System.out.println(pobj.getProperty("url"));
		
	
		
	}

}
