package in.co.rays.basics;
import java.util.Date;
import java.text.SimpleDateFormat;
public class SimpleDateFormate {
	public static void main(String[] args) {
		 Date d= new Date();
		 
		 	System.out.println(d);
		 
		 		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 
		 			String s = sdf.format(d);
		 	System.out.println(s);
		 	
		 
		 

	}

}
