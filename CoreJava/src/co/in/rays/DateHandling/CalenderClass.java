package co.in.rays.DateHandling;

import java.util.Calendar;
import java.util.Date;

public class CalenderClass {
	public static void main(String[] args) {
		Calendar C = Calendar.getInstance();
			System.out.println(C.getTime());
		int year = C.get(Calendar.YEAR);
			System.out.println(year);
		int month = C.get(Calendar.MONTH);
			System.out.println(month);
		int date = C.get(Calendar.DATE);
			System.out.println(date);
		int era = C.get(Calendar.ERA);
			System.out.println(era);
		int woy= C.get(Calendar.WEEK_OF_YEAR);
			System.out.println(woy);
		int wom = C.get(Calendar.DAY_OF_WEEK_IN_MONTH);
			System.out.println(wom);
			
	}
}
