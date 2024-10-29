package practice.testng;

import java.sql.Date;

public class CaptureTimeStamp {
	
	public static void main(String[] args) {
		
		String time = new java.util.Date().toString().replace(" ", ":");
		System.out.println(time);
	}

}
