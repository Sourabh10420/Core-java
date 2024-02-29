
package in.co.rays.PrepredStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TsetInsert {
	
	public static void main(String[] args) throws   Exception{
		
		
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection Conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
		 
		
		
		PreparedStatement  ps =  Conn.prepareStatement("insert into books values(7,'HomeScience',700,'Hindi',4)");
		
		int i =ps.executeUpdate();
		
		System.out.println("insert ho gya"+"=" + i  );
		
	}
		

}
	

