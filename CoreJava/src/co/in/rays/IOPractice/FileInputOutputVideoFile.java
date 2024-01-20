package co.in.rays.IOPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputVideoFile {

	public static void main(String[] args) {
		try {
		
		FileInputStream in = new FileInputStream("C:\\Users\\hp\\Desktop\\sourabh1\\SourabhDance.mp4");
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\hp\\Desktop\\sourabh2\\SourabhVideo.mp4");
		
		int ch=in.read();
		
		while(ch!=-1) {
			
			out.write(ch);
			
			ch=in.read();
		}
		in.close();
		out.close();
		
		System.out.println("File Recived");
		
	}catch(Exception e) {
		
		System.out.println(e);
	}
}
}