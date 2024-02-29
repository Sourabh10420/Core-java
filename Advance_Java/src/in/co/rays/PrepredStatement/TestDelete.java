package in.co.rays.PrepredStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestDelete {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection conn	=DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");
	
	String sql = "delete from books where id = 7";
	
	PreparedStatement ps=conn.prepareStatement(sql);
	
int i 	=ps.executeUpdate();


System.out.println("Delete data susseccfully"+ "="+ i);
		
		
		
		
	}

}
