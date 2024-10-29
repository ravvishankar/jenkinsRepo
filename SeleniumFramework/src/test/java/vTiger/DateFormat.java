package vTiger;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		String actualDate = sim.format(date);
		System.out.println(actualDate);
		
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,30);
		String requiredDate = sim.format(cal.getTime());
		System.out.println(requiredDate);
	}

}
