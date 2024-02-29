package in.co.rays.PrepredStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DynamicPreparedStatment {

	public static void main(String[] args) throws Exception {

		// testInsert(7,"HomeScience",700,"SocialScience",1);

		// testDelete(7);

		testUpdate(6, "Homescience");

		// testRead();

	}

	public static void testInsert(int id, String BookName, int BookPrice, String Medium, int Subject_id)
			throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");

		PreparedStatement ps = Conn.prepareStatement("insert into books values(?,?,?,?,?)");

		ps.setInt(1, id);
		ps.setString(2, BookName);
		ps.setInt(3, BookPrice);
		ps.setString(4, Medium);
		ps.setInt(5, Subject_id);

		int i = ps.executeUpdate();

		System.out.println("insert ho gya" + "=" + i);
	}

	public static void testUpdate(int id, String BookName) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");

		String sql = "update books set BookName = ? where id = ?";

		PreparedStatement st = conn.prepareStatement(sql);

		st.setInt(2, id);
		st.setString(1, BookName);

		int i = st.executeUpdate();

		System.out.println("Update data Succesfully" + "=" + i);
	}

	public static void testDelete(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");

		String sql = "delete from books where id = ?";

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, id);

		int i = ps.executeUpdate();

		System.out.println("Delete data susseccfully" + "=" + i);

	}

	public static void testRead() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");

		PreparedStatement st = conn.prepareStatement("Select * from Books");

		ResultSet rs = st.executeQuery();

		while (rs.next()) {

			System.out.print("\t" + rs.getInt(1));

			System.out.print("\t" + rs.getString(2));

			System.out.print("\t" + rs.getInt(3));

			System.out.print("\t" + rs.getString(4));

			System.out.println("\t" + rs.getInt(5));

		}

	}

}
