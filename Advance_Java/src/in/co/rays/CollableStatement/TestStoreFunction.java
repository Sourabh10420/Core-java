package in.co.rays.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class TestStoreFunction {
	
	public static void main(String[] args) throws Exception {
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");
		
		CallableStatement cs =conn.prepareCall("{?= Call square(?)}");
		
		
		cs.setInt(2, 10);
		
		cs.registerOutParameter(1, Types.INTEGER);
		
		cs.execute();
		
		
		System.out.println("square =" + cs.getInt(1));
		
		
		
	}

}
