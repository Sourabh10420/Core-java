package in.co.rays.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BinaryFile {
	
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream in = new FileInputStream("C:\\Users\\hp\\Desktop\\sourabh1\\image1.jpg");
		
		FileOutputStream out= new FileOutputStream("C:\\Users\\hp\\Desktop\\sourabh2\\image.jpg");
		
		      int ch=in.read();
		      
		      
		      while(ch!=-1) {
		    	  
		    	  
		    	  
		    	  out.write(ch);
		    	  
		    	  ch=in.read();
		    	  
		    	  
		      }
		      
		in.close();
		out.close();
		System.out.println("image aa gyi");
		
	}

}
