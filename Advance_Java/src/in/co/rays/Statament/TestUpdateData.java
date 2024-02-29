package in.co.rays.Statament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdateData {
	
	public static void main(String[] args) {
		
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
			
			Statement st =conn.createStatement();
			
		int k	= st.executeUpdate("update library set name = 'Minu' where id = 6");
		
				System.out.println("Update ho gya"+ k);
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}

}
}
