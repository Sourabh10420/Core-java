package in.co.rays.IO;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriteData {
	
	public static void main(String[] args) throws Exception {
		
		
		FileWriter file= new FileWriter("C:\\Users\\hp\\Desktop\\sourabh\\sourabh.txt");
		
		
		file.write("i am sourabh");
		
		file.write("i am student");
		
		
		
		file.close();
		System.out.println("check C:\\Users\\hp\\Desktop\\sourabh\\sourabh.txt");
		
	}

}
