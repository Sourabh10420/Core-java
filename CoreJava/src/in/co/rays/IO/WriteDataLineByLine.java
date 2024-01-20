package in.co.rays.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataLineByLine {
	
	
	public static void main(String[] args) throws Exception {
		
		FileWriter file=new FileWriter("C:\\Users\\hp\\Desktop\\sourabh\\shankar.txt");
		
		PrintWriter pw=new PrintWriter(file);
		
		for (int i = 0; i <=5; i++) {
			
			
			pw.println(i+"sourabh");
			
			
			
		}
		
		pw.close();
		
		file.close();
		System.out.println("check");
		
	}
	
	

}
