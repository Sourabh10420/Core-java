package co.in.rays.IOPractice;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestFileReader {

	public static void main(String[] args) {
		
		try {
			
			FileReader fd = new FileReader("C:\\Users\\hp\\Desktop\\sourabh\\Muskan1.txt");
			 
			 BufferedReader bf = new BufferedReader(fd);
			
			 String str = bf.readLine();
			 
			 while(str!=null) {
				  
				 System.out.println(str);
				 
				 str = bf.readLine();
				 
				 
		
			 }
		bf.close();
		fd.close();
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}
	
}
		
		
		
		
	
	

