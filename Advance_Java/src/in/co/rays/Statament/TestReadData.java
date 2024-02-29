package in.co.rays.Statament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestReadData {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");
			
			 Statement st =conn.createStatement();
			 
			 
			 ResultSet rs =st.executeQuery("select * from marksheet1");
			 
			 
			 while(rs.next()) {
				 
				 System.out.print("\t"+rs.getInt(1));
				 
				 System.out.print("\t"+rs.getString(2));
				 
				 System.out.print("\t"+rs.getString(3));
				 
				 System.out.print("\t"+rs.getInt(4));
				 
				 System.out.print("\t"+rs.getInt(5));
				 
				 System.out.print("\t"+rs.getInt(6));
				 
				 System.out.print("\t"+rs.getInt(7));
				 
				 System.out.print("\t"+rs.getInt(8));
				 
				 System.out.print("\t"+rs.getString(9));
				 
				 System.out.println("\t"+rs.getInt(10));
				 
				 
				 
				 
			 }
			
		}
		catch(Exception e) {
			
			
			System.out.println(e);
		}
	}

}
