package in.co.rays.SimpleDateFormate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
public class SimplePars1 {
	public static void main(String[] args) throws ParseException {
		String str = "25/10/2020";
		String str1= "12:15:15";
		System.out.println(str);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date d= sdf.parse(str);
				
				System.out.println(d);
	}
}
