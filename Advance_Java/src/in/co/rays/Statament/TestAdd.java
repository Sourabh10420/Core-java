package in.co.rays.Statament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestAdd {
	
	public static void main(String[] args) {
		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
		
		Statement st =conn.createStatement();
		
	int i =st.executeUpdate("Alter table marksheet1 add column Subject_id int");
		 
		System.out.println("Add Column successfully"+"="+i);
		
		
		
		
		
	}catch(Exception e) {
		
		System.out.println(e);
	}

	}
}
