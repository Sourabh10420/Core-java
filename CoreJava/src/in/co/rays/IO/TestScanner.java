package in.co.rays.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestScanner {
	
	
	public static void main(String[] args) throws Exception {
		
		
		FileReader file=new FileReader("C:\\Users\\hp\\Desktop\\sourabh\\shankar.txt");
		
		
		Scanner sc=new Scanner(file);
		
		
		while(sc.hasNext()) {
			
			System.out.println(sc.nextLine());
			
			
			
		}
	file.close();	
		
		
		
		
	}

}
