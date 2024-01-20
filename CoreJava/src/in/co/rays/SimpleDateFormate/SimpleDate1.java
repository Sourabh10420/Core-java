package in.co.rays.SimpleDateFormate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate1 {
		public static void main(String[] args) {
			Date d = new Date();
			System.out.println(d);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			String str = sdf.format(d);
			System.out.println(str);
		}

}
