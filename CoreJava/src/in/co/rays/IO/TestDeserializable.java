package in.co.rays.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class TestDeserializable {
	
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file= new FileInputStream("C:\\Users\\hp\\Desktop\\sourabh1\\serial.txt");
		
		ObjectInputStream object=new ObjectInputStream(file);
		
		 Marksheet m = (Marksheet) object.readObject();
		 
		 
		 System.out.println(m.name);
		 System.out.println(m.chemistry);
		 System.out.println(m.physics);
		 System.out.println(m.maths);
		 System.out.println(m.total);
		
		
		
		
		
	}

}
