package in.co.rays.StudentDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDetailsModel {

	public Integer nextPk() throws Exception {

		int pk = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select max(id) from StudentDetails");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;
	}

	public void add(StudentDetailsBean bean) throws Exception {

		int pk = nextPk();

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");

		PreparedStatement ps = conn.prepareStatement("insert into StudentDetails values(?,?,?,?,?,?,?)");

		ps.setInt(1, pk);
		ps.setString(2, bean.getName());
		ps.setString(3, bean.getSureName());
		ps.setDate(4, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(5, bean.getMobileNo());
		ps.setString(6, bean.getEnrollmentNo());
		ps.setDate(7, new java.sql.Date(bean.getAdmistionDate().getTime()));

		int i = ps.executeUpdate();

		System.out.println("insert data succefully =" + i);
	}

	public void update(StudentDetailsBean bean) throws Exception {

		int pk = nextPk();

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");

		PreparedStatement ps = conn.prepareStatement(
				"update StudentDetails set Name=?,Sure_Name=?, Dob=?, Mobile_No=?, Enrollment_No=?, Admistion_Date=? where Id=?");

		ps.setString(1, bean.getName());
		ps.setString(2, bean.getSureName());
		ps.setDate(3, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(4, bean.getMobileNo());
		ps.setString(5, bean.getEnrollmentNo());
		ps.setDate(6, new java.sql.Date(bean.getAdmistionDate().getTime()));
		ps.setInt(7, bean.getId());

		int i = ps.executeUpdate();

		System.out.println("data update succefully =" + i);
	}

	public void delete(int id) throws Exception {

		int pk = nextPk();

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");

		PreparedStatement ps = conn.prepareStatement("delete from StudentDetails where id =?");

		ps.setInt(1, id);

		int j = ps.executeUpdate();

		System.out.println("Delete Data Successfully =" + j);
	}

	public List search() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select * from StudentDetails");

		List list = new ArrayList();

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			StudentDetailsBean bean = new StudentDetailsBean();

			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setSureName(rs.getString(4));
			bean.setDob(rs.getDate(5));
			bean.setEnrollmentNo(rs.getString(6));
			bean.setAdmistionDate(rs.getDate(7));

		}

		return list;
	}

	public List search(StudentDetailsBean bean, int pageNo, int pageSize) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");

		StringBuilder bd = new StringBuilder("select * from StudentDetails where 1=1");

		if (bean != null) {
			if (bean.getId() > 0) {
				bd.append(" and id =" + bean.getId());
			}
			if (bean.getName() != null && bean.getName().length() > 0) {
				bd.append(" and Name like '" + bean.getName() + "%'");
			}
		}
		if (pageSize > 0) {

			pageNo = (pageNo - 1) * pageSize;

			bd.append(" limit " + pageNo + ", " + pageSize);
		}

		System.out.println("sql ->" + bd);

		PreparedStatement ps = conn.prepareStatement(bd.toString());

		List list = new ArrayList();

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			bean = new StudentDetailsBean();

			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setSureName(rs.getString(3));
			bean.setDob(rs.getDate(4));
			bean.setMobileNo(rs.getString(5));
			bean.setEnrollmentNo(rs.getString(6));
			bean.setAdmistionDate(rs.getDate(7));
			list.add(bean);
		}
		return list;
	}
}