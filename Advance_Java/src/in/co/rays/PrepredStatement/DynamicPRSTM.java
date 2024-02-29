package in.co.rays.PrepredStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DynamicPRSTM {

	public static void main(String[] args) throws Exception {

		// testInsert(5,"Kunal","mandloi",200355);

		// testUpdate(5000,3);

		// testAdd();

		// testDelete(5);

		testRead();

	}

	public static void testInsert(int id, String name, String surename, int salary) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");

		String sql = ("insert into employee values(?,?,?,?)");

		PreparedStatement st = con.prepareStatement(sql);

		st.setInt(1, id);
		st.setString(2, name);
		st.setString(3, surename);
		st.setInt(4, salary);

		int i = st.executeUpdate();

		System.out.println("Insert data successfully" + "=" + i);

	}

	public static void testUpdate(int id, int salary) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");

		String sql = "update employee set salary = ? where id = ?";

		PreparedStatement st = con.prepareStatement(sql);

		st.setInt(1, id);
		st.setInt(2, salary);

		int k = st.executeUpdate();

		System.out.println("Update Successfully" + "=" + k);

	}

	public static void testAdd() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");

		String sql = "alter table employee add column AdharNo int";

		PreparedStatement st = con.prepareStatement(sql);

		int k = st.executeUpdate();

		System.out.println("add Successfully" + "=" + k);

	}

	public static void testDelete(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");

		String sql = "delete from employee where id = ?";

		PreparedStatement st = con.prepareStatement(sql);

		st.setInt(1, id);

		int m = st.executeUpdate();

		System.out.println("Delete Successfully" + "=" + m);

	}

	public static void testRead() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");

		String sql = "select * from employee";

		PreparedStatement st = con.prepareStatement(sql);

		ResultSet rs = st.executeQuery();

		while (rs.next()) {

			System.out.print("\t" + rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.println("\t" + rs.getInt(5));

		}

	}

}