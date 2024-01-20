package co.in.rays.IOPractice;

import java.io.File;

public class ReadFileAttributes {

	public static void main(String[] args) {
		
		File f =new File("C:\\Users\\hp\\Desktop\\sourabh1\\sourabh2.txt");
		
		if(f.exists()) {
			
			System.out.println("name ="+ f.getName());
		
			
		}
	}
}
