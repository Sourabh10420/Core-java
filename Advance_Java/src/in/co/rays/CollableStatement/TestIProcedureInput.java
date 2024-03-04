package in.co.rays.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestIProcedureInput {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");
		
		CallableStatement cs =conn.prepareCall("{Call booksIn(?)}");
		
		cs.setInt(1, 3);
		
		cs.execute();
		
		ResultSet rs = cs.getResultSet();
		
		while (rs.next()) {
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getInt(5));
		}
	}
	
}
