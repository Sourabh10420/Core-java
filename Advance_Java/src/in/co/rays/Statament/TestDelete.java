package in.co.rays.Statament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestDelete {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection Conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root","root");
	
		 	Statement St =Conn.createStatement();
		 	
		 int i =	St.executeUpdate("delete from marksheet where id = 5");
		 
		 
		 System.out.println("delete From Marksheet Table"+"="+ i);
	}
}
