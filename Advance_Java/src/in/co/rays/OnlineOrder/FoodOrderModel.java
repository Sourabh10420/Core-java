package in.co.rays.OnlineOrder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FoodOrderModel {
	
	
	
	public Integer nextPk() throws Exception{
		
		int pk =0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");

		PreparedStatement ps = conn.prepareStatement("select max(SN) from FoodOrder");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;
		
	}
	
	public void add(FoodOrderBean bean) throws Exception{
		
		int pk = nextPk();
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");

		PreparedStatement ps = conn.prepareStatement("insert into FoodOrder values(?,?,?,?,?,?,?,?)");
		
		ps.setInt(1, pk);
		ps.setString(2, bean.getName());
		ps.setString(3, bean.getFoodName());
		ps.setInt(4, bean.getFoodPrice());
		ps.setString(5,bean.getAddress());
		ps.setString(6, bean.getOrderMod());
		ps.setDate(7, new java.sql.Date(bean.getOrderDate().getTime()));
		ps.setString(8, bean.getEmailId());
		
		int i =ps.executeUpdate();
		
		System.out.println("Data Inserted =" + i);
		
	}
	
	public void update(FoodOrderBean bean) throws Exception{
		
			int pk = nextPk();
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");
		
		String str = "update FoodOrder set Name=?,Food_Name=?,Food_Price=?,Address=?,Order_Mod=?,Order_Date=?,Email_Id=? where SN=?";

		PreparedStatement ps = conn.prepareStatement(str);
		
		ps.setString(1, bean.getName());
		ps.setString(2, bean.getFoodName());
		ps.setInt(3, bean.getFoodPrice());
		ps.setString(4,bean.getAddress());
		ps.setString(5, bean.getOrderMod());
		ps.setDate(6, new java.sql.Date(bean.getOrderDate().getTime()));
		ps.setString(7, bean.getEmailId());
		ps.setInt(8, bean.getSn());
		
		
		int i =ps.executeUpdate();
		
		System.out.println("Data Updated =" + i);
	}
	
	public void delete(int Sn) throws Exception{
		
		int pk = nextPk();
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");
		
		String str = "delete from FoodOrder where Sn =?";
		
		PreparedStatement ps =conn.prepareStatement(str);
		
		ps.setInt(1, Sn);
		
	int j = ps.executeUpdate();
	
		System.out.println("data Deleted = " + j);
		
	}
	
	public FoodOrderBean findByPk(int Sn) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");
		
		PreparedStatement ps =conn.prepareStatement("select * from FoodOrder where Sn = ?");
		
		ps.setInt(1, Sn);
		
		ResultSet rs = ps.executeQuery();
		
		FoodOrderBean bean = new FoodOrderBean();
		
		while (rs.next()) {
			
			bean.setSn(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setFoodName(rs.getString(3));
			bean.setFoodPrice(rs.getInt(4));
			bean.setAddress(rs.getString(5));
			bean.setOrderMod(rs.getString(6));
			bean.setOrderDate(rs.getDate(7));
			bean.setEmailId(rs.getString(8));
			
		}
		return bean;
	}
	
	public void searchByNormal(FoodOrderBean bean) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");
		
		PreparedStatement ps =conn.prepareStatement("select * from FoodOrder");
		
	    ResultSet rs = ps.executeQuery();
	    
	    while (rs.next()) {
	    	
	    	System.out.print("\t"+ rs.getInt(1));
	    	System.out.print("\t"+ rs.getString(2));
	    	System.out.print("\t"+ rs.getString(3));
	    	System.out.print("\t"+ rs.getInt(4));
	    	System.out.print("\t"+ rs.getString(5));
	    	System.out.print("\t"+ rs.getString(6));
	    	System.out.print("\t"+ rs.getDate(7));
	    	System.out.println("\t"+ rs.getString(8));
	    	
	    }
	}
	
	public List search() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");
		
		PreparedStatement ps =conn.prepareStatement("select * from FoodOrder");
		
	    ResultSet rs = ps.executeQuery();
	    
	    List list = new ArrayList();
	    
	    while (rs.next()) {
	    	
	    	FoodOrderBean bean = new FoodOrderBean();
	    	
	    	bean.setSn(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setFoodName(rs.getString(3));
			bean.setFoodPrice(rs.getInt(4));
			bean.setAddress(rs.getString(5));
			bean.setOrderMod(rs.getString(6));
			bean.setOrderDate(rs.getDate(7));
			bean.setEmailId(rs.getString(8));
			
		}
	   	return list;
	}
	
	public List search(FoodOrderBean bean, int pageNo, int pageSize)  throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root", "root");
	
		StringBuilder bd = new StringBuilder("select * from FoodOrder where 1=1");
		
			if (bean != null) {
				if(bean.getSn()>0) {
					
					bd.append(" and SN =" + bean.getSn());
				}
				if(bean.getName() != null && bean.getName().length()>0) {
					
					bd.append(" and Name like '" + bean.getName() + "%'");
				}
			}
		
		if(pageSize>0) {
			
			pageNo = (pageNo - 1) * pageSize;
			
				bd.append(" limit " + pageNo + ", " + pageSize);
		}
		
		System.out.println("sql->" + bd);
			
		PreparedStatement ps =conn.prepareStatement(bd.toString());
		
		ResultSet rs = ps.executeQuery();
		
		List list = new ArrayList();
		
		while (rs.next()) {
			
			bean =  new FoodOrderBean();
			
			bean.setSn(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setFoodName(rs.getString(3));
			bean.setFoodPrice(rs.getInt(4));
			bean.setAddress(rs.getString(5));
			bean.setOrderMod(rs.getString(6));
			bean.setOrderDate(rs.getDate(7));
			bean.setEmailId(rs.getString(8));
			
			list.add(bean);
		}
		
		return list;
		
		
	}
}
