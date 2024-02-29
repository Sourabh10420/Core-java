package in.co.rays.PrepredStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestUpdate {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");

		String sql = "update books set BookName = 'Apptitude' where id = 1";

		PreparedStatement st = conn.prepareStatement(sql);

		int i = st.executeUpdate();

		System.out.println("Update data Succesfully" + "=" + i);
	}

}
