package co.in.rays.IOPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputOutputFile {

	public static void main(String[] args) {
		
		try {
		
		FileInputStream in = new FileInputStream("C:\\Users\\hp\\Desktop\\sourabh1\\image1.jpg");
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\hp\\Desktop\\sourabh2\\Image.jpg");
		
		int ch =in.read();
		
		
		while(ch!=-1) {
				
				out.write(ch);
				
				ch = in.read();
			}
		
		in.close();	
		out.close();
		
		System.out.println("File Recived Succsefully");
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}
}
