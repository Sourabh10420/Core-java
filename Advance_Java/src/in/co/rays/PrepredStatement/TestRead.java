package in.co.rays.PrepredStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestRead {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
		
		PreparedStatement st =conn.prepareStatement("Select * from Books");
		
		ResultSet rs =st.executeQuery();
		
		while(rs.next()) {
			
			System.out.print(rs.getInt(1));
			
			System.out.print(rs.getString(2));
			
			System.out.print(rs.getInt(3));
			
			System.out.print(rs.getString(4));
			
			System.out.println(rs.getInt(5));
			
			
		}
	}

}
