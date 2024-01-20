package in.co.rays.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	
	
	public static void main(String[] args) throws Exception {
		
		
		try {
			FileReader file=new FileReader("C:\\Users\\hp\\Desktop\\sourabh\\sourabh.txt");
			
			
			int ch=file.read();
			
			
			while(ch!=-1) {
				
				
				System.out.print((char)ch);
				
				
				
				ch=file.read();
				
			}
			
			file.close();
			
		} catch (FileNotFoundException e) {
			//System.out.println(e);
			e.printStackTrace();
		}
		
		
		
	}

}
