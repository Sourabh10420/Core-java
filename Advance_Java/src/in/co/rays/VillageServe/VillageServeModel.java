package in.co.rays.VillageServe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VillageServeModel {
	
	
	public Integer nextPk() throws Exception{
		
		int pk = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root","root");
		
			String str = "select max(SN) from VillageServe";
		
			PreparedStatement ps =conn.prepareStatement(str);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				pk = rs.getInt(1);
				
			}
			return pk+1;
	}
	
	public void add(VillageServeBean bean) throws Exception{
		
		int pk = nextPk(); 
		
	Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_practicle", "root","root");
		
			String str = ("insert into VillageServe values(?,?,?,?,?,?)");
		
			PreparedStatement ps =conn.prepareStatement(str);
			
			ps.setInt(1, pk );
			ps.setString(2, bean.getVillageName());
			ps.setInt(3, bean.getMalePersone());
			ps.setInt(4, bean.getFemalePersone());
			ps.setInt(5, bean.getChild());
			ps.setString(6, bean.getVillageCode());
			
			int k =ps.executeUpdate();
			
			System.out.println("Data inserted =" + k);
			
	}

}
