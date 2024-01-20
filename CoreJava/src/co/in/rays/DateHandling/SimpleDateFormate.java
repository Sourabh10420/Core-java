package co.in.rays.DateHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormate {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
			System.out.println("today formate:-"+ d);
		int day= d.getDay();
			System.out.println("today day:-"+ day);
		int date = d.getDate();
			System.out.println("today date:-"+ date);
		int hour = d.getHours();
			System.out.println("Hour:-"+ hour);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
			String Date = sdf.format(d);
				System.out.println(Date);
		String str = "01/02/2024";
			System.out.println(str);
		SimpleDateFormat pqr = new SimpleDateFormat("yyyy/MM/dd");
		
			Date d1 = new Date();
			
			String sr = "2024/01/02";
			
			SimpleDateFormat ppp = new SimpleDateFormat("yyyy/MM/dd");
				Date d2 = ppp.parse(sr);
				System.out.println(d2);
		
		
	}
}
