package in.co.rays.PrepredStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatment {

	
	public static void main(String[] args)  throws Exception {
		
		
	//	testInsert();
		
		//testDelete();
		
		//testUpdate();
		
		testRead();
		
	}
	

		
		public static void testInsert() throws Exception{
			
			
			

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 Connection Conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
			 
			
			
			PreparedStatement  ps =  Conn.prepareStatement("insert into books values(7,'HomeScience',700,'Hindi',4)");
			
			int i =ps.executeUpdate();
			
			System.out.println("insert ho gya"+"=" + i  );
		}
			
		
			
			public static void testUpdate() throws Exception {
				
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
			
				String	sql = "update books set BookName = 'Politics' where id = 1";
				
				PreparedStatement st =conn.prepareStatement(sql);
				
				int i =st.executeUpdate();
				
				System.out.println("Update data Succesfully"+"="+ i);
			}

			public static void testDelete() throws Exception {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			Connection conn	=DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh", "root", "root");
			
			String sql = "delete from books where id = 7";
			
			PreparedStatement ps=conn.prepareStatement(sql);
			
		int i 	=ps.executeUpdate();


		System.out.println("Delete data susseccfully"+ "="+ i);
				
				
				
				
			}

			public static void testRead() throws Exception {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabh","root","root");
				
				PreparedStatement st =conn.prepareStatement("Select * from Books");
				
				ResultSet rs =st.executeQuery();
				
				while(rs.next()) {
					
					System.out.print("\t"+rs.getInt(1));
					
					System.out.print("\t"+rs.getString(2));
					
					System.out.print("\t"+rs.getInt(3));
					
					System.out.print("\t"+rs.getString(4));
					
					System.out.println("\t"+rs.getInt(5));
					
					
				}	

	}
		



}
