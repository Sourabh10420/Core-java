package in.co.rays.Statament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTrantictionHandle {
	
public static void main(String[] args) throws Exception {
			
		Connection Conn = null;
			
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
		 
		Statement St =Conn.createStatement();
		
		Conn.setAutoCommit(false);
		
		int  I = St.executeUpdate("insert into marksheet values(13,'Hemant',96,'A++','Pass','First Divition','homesc')");
		
			I  =   St.executeUpdate("insert into marksheet values(14,'Pravesh',96,'A++','Pass','First Divition','homesc')");
			
			I  =   St.executeUpdate("insert into marksheet values(15,'Lalu',96,'A++','Pass','First Divition','homesc')");
			
			Conn.commit();
			
		
		System.out.println("update on data"+"="+ I);
				
		}catch(Exception e) {
			
			Conn.rollback();
			
			System.out.println(e.getMessage());
		}
		finally{	
			Conn.close();
		}
  }
}
