package in.co.rays.Statament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection Conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
				
			Statement st	=Conn.createStatement();
			
			
			int i =st.executeUpdate("update marksheet set name = 'Shelendra' where id = 3");
			
			System.out.println("update On table"+"="+ i);
	}

}
