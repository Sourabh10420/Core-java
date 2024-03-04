package in.co.rays.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestProcedurOutput {
	
	
		
		public static void main(String[] args) throws Exception {
			
			try {
				
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");
			
			CallableStatement cs =conn.prepareCall("{Call booksOut(?)}");
			
			cs.registerOutParameter(1,Types.INTEGER);
			
			cs.execute();
			
			 int values =cs.getInt(1);
			 
			 
			 System.out.println("Result from output store procedure =" + values);
		}catch(Exception e) {
			
			e.printStackTrace();
		}
			
		}

}
