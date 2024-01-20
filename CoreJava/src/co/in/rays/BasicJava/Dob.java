package co.in.rays.BasicJava;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Dob{

	public static void main(String[] args){
	
	Date d=new Date();
	System.out.println(d);

	long time =d.getTime();
	//System.out.println(time);

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy   HH:mm:s");
	String timeAndDate = sdf.format(d);
	System.out.println(timeAndDate);
	
	
	
	}
}