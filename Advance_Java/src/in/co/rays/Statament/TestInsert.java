package in.co.rays.Statament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection Conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
		 
		Statement St =Conn.createStatement();
		
		int  I = St.executeUpdate("insert into marksheet values(12,'Mohan',96,'A++','Pass','First Divition','homesc')");
		
		
	//	int j =St.executeUpdate("Delete from marksheet where id = 1");
	
			
				System.out.println("update on data"+"="+ I);
				
				//System.out.println("Delete data"+ j);
				
			
	}

}
