package co.in.rays.IOPractice;

import java.io.FileWriter;

public class TestWriteData {

	public static void main(String[] args) {
		try {
		
		FileWriter fw = new FileWriter("C:\\Users\\hp\\Desktop\\sourabh\\sourabh11.txt");
		
		fw.write("sourabh mandloi");
		fw.write("muskan mandloi");
		
		System.out.println(fw);
		
		fw.close();
	}catch(Exception e) {
		
		System.out.println(e);
	}
		
}
}
