package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleParse {

	
	public static void main(String[] args) throws ParseException {
		
		String s="16/08/2000";
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		Date d=sdf.parse(s);
		
		
		System.out.println(d);
	}
}
