package in.co.rays.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date("1996/8/28");
		
		System.out.println("today date ="+ d);
		
		System.out.println(" Date long =" + d.getTime());
		
		
		System.out.println("Sql Date =" + new java.sql.Date(d.getTime()));
		
		
SimpleDateFormat sdf = new SimpleDateFormat("1996/08/28");
		
		
		String str = sdf.format(d);
		
		System.out.println("Date ="+ str);

		
		
		
		
		
		

}
	
}
			