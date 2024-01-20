package co.in.rays.IOPractice;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineByLine {
	
	public static void main(String[] args) {
		
		try {
		FileReader file = new FileReader("C:\\Users\\hp\\Desktop\\sourabh\\Sourabh1.txt");
		
		BufferedReader bf = new BufferedReader(file);
		
		String sc =bf.readLine();
		
		while(sc!=null) {
			
			System.out.println(sc);
			
			sc=bf.readLine();
		}
		
		bf.close();
	}catch(Exception e) {
		
		System.out.println(e);
	}

}
}