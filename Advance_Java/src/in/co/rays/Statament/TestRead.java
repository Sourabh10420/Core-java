package in.co.rays.Statament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestRead {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");
				
		Statement st=conn.createStatement();
		
		
		ResultSet rs = st.executeQuery("select * from marksheet ");
		
		while (rs.next()) {
				
				System.out.print("\t"+rs.getInt(1));
			
				System.out.print("\t"+rs.getString(2));
				
				System.out.print("\t"+rs.getInt(3));
				
				System.out.print("\t"+rs.getString(4));
				System.out.print("\t"+rs.getString(5));
				
				System.out.println("\t"+rs.getString(6));
			
		
			
		}
			
		}
		
	
	}


