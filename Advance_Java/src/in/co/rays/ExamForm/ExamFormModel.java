package in.co.rays.ExamForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.MarksheetModel.MarksheetBean;

public class ExamFormModel {
	
	public void add(ExamFormBean bean) throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle","root","root");
		
	String sql = "insert into examForm values(?,?,?,?,?,?,?)";
		PreparedStatement st=conn.prepareStatement(sql);
		
		
		st.setInt(1,bean.getId());
			st.setString(2, bean.getFirstName());
				st.setString(3,bean.getLastName());
					st.setString(4, bean.getEmailId());
				st.setString(5, bean.getMobileNo());
			st.setString(6, bean.getSubject());
		st.setInt(7,bean.getSubjectId());
		
		int i =st.executeUpdate();
		
			System.out.println("Insert data Successfully ="+ i);
		
	}
	
	public void update(ExamFormBean bean) throws Exception{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle","root","root");
		String sql = "update ExamForm set First_Name =?,Last_Name=?,Email_Id=?,Mobile_No=?,Subject_Name=?,Subject_Id=? where Id =?";
		
	PreparedStatement st=conn.prepareStatement(sql);
		
			st.setString(1, bean.getFirstName());
				st.setString(2,bean.getLastName());
					st.setString(3, bean.getEmailId());
						st.setString(4, bean.getMobileNo());
					st.setString(5, bean.getSubject());
				st.setInt(6,bean.getSubjectId());
			st.setInt(7,bean.getId()); 
		
				int i =st.executeUpdate();
		
		System.out.println("update data Successfully ="+ i);
	}
	public void delete(int id) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle","root","root");
	String sql = "delete from ExamForm where id =?";
	
PreparedStatement st=conn.prepareStatement(sql);
	
		st.setInt(1, id);
		
	int i = st.executeUpdate();
	
	System.out.println("Delete Data Successfully = " + i);
		
	}
	
	public void searchByNormal(ExamFormBean bean) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle","root","root");
			String sql = "select * from ExamForm";
			
		PreparedStatement st=conn.prepareStatement(sql);
			
			ResultSet rs =st.executeQuery();
			
	while(rs.next()) {
		
		System.out.print("\t"+ rs.getInt(1));
			System.out.print("\t"+ rs.getString(2));
				System.out.print("\t"+ rs.getString(3));
					System.out.print("\t"+ rs.getString(4));
				System.out.print("\t"+ rs.getString(5));
			System.out.print("\t"+ rs.getString(6));
		System.out.println("\t"+ rs.getInt(7));
		
	}
}
	
	public List searchByModrate() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle","root","root");
			String sql = "select * from ExamForm";
			
		PreparedStatement st=conn.prepareStatement(sql);
			
			ResultSet rs =st.executeQuery();
		
			List list = new ArrayList();
			
		while(rs.next()) {
			
			ExamFormBean bean = new ExamFormBean();
			
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setEmailId(rs.getString(4));
			bean.setMobileNo(rs.getString(5));
			bean.setSubject(rs.getString(6));
			bean.setSubjectId(rs.getInt(7));
			
		list.add(bean)	;
	}
		return list;
	} 
	
}

