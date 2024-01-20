package in.co.rays.SimpleDateFormate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleParsString {
	public static void main(String[] args) throws ParseException {
		
	
		String str = "25/08/1996";
			System.out.println(str);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date d = sdf.parse(str);
			System.out.println(d);
		

		}
		
}
