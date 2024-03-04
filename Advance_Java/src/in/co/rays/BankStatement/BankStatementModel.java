package in.co.rays.BankStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankStatementModel {
	
		
		public void add(BankStatementBean bean) throws Exception{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle","root","root");
			
			PreparedStatement pt =conn.prepareStatement("insert into BankStatement values(?,?,?,?,?,?)");
			
			
			pt.setInt(1, bean.getId());
			pt.setString(2, bean.getName());
			pt.setString(3, bean.getBankname());
			pt.setString(4, bean.getAccountno());
			pt.setInt(5, bean.getBalance());
			pt.setInt(6, bean.getDeposite());
		
			int i  =	pt.executeUpdate();
		
				System.out.println("Add data successfully = " + i);	
			
			
			
		}
		
		public void update(BankStatementBean bean) throws Exception{
			
	Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle","root","root");
			
			PreparedStatement pt =conn.prepareStatement("update BankStatement set Name=?,Bank_Name= ?,Account_No = ?,Balance = ?, Deposite =? where id = ?");
			
			
			
			pt.setString(1, bean.getName());
			pt.setString(2, bean.getBankname());
			pt.setString(3, bean.getAccountno());
			pt.setInt(4, bean.getBalance());
			pt.setInt(5, bean.getDeposite());
			pt.setInt(6, bean.getId());
		
			int i  =	pt.executeUpdate();
		
				System.out.println("Add data successfully = " + i);	
			
		
			
		}
	public void delete(int id) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle","root","root");
		
		PreparedStatement pt =conn.prepareStatement("delete from BankStatement where id =?");
		
		pt.setInt(1, id);
		
		int i =pt.executeUpdate();
		
		System.out.println("Delete Data Succefully ="+ i);
		
	}
		
	public void searchBySimple(BankStatementBean bean) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle","root","root");
		
		PreparedStatement pt =conn.prepareStatement("select *,(Balance-Deposite) as Remaining from BankStatement");
		
		 ResultSet rs =pt.executeQuery();
		 
		 
		 while (rs.next()) {
			 	 
			 System.out.print("\t" + rs.getInt(1));
			 System.out.print("\t"+ rs.getString(2));
			 System.out.print("\t"+ rs.getString(3));
			 System.out.print("\t"+ rs.getString(4));
			 System.out.print("\t"+ rs.getInt(5));
			 System.out.println("\t"+ rs.getInt(6));
			}
		
	}
	
	

}


