package in.co.rays.Statament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestDeleteData {
	
	public static void main(String[] args)  {
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		Connection conn	=DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
		
			
			Statement st =conn.createStatement();
			
				int i =st.executeUpdate("delete from marksheet1 where SN = 5");
				
				System.out.println("Delete data successefull "+"="+ i);
				
			
		}
	catch(Exception e) {
		
		System.out.println(e);
	}	
		
	}

}
