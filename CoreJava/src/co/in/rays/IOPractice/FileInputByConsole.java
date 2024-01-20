package co.in.rays.IOPractice;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileInputByConsole {
	
	public static void main(String[] args) {
		System.out.println("write a thought in cansole and print this code with automated file");
		try {
		InputStreamReader rd = new InputStreamReader(System.in);
		
		BufferedReader bf = new BufferedReader(rd);
		
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\hp\\Desktop\\sourabh\\SourabhText.txt"));
		String str = bf.readLine();
		
		for (int i = 0; i <str.length(); i++) {
			
			if (!str.equals("jab tak hai jaan")) {
				
				pw.println(str);
				
				str = bf.readLine();
			
			}
		}
		
		pw.close();
		bf.close();
		System.out.println("i can handle this code");
		
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
