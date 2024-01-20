package in.co.rays.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		
	
	
	
	FileOutputStream file=new FileOutputStream("C:\\Users\\hp\\Desktop\\sourabh1\\serial.txt");
	
	
	
	ObjectOutputStream object=new ObjectOutputStream(file);
	
	
	
	Marksheet m=new Marksheet();
	
	
	m.name="sourabh";
	m.physics=100;
	m.chemistry=98;
	m.maths=101;
	m.total=m.physics+m.chemistry+m.maths;
	
	object.writeObject(m);
	
	System.out.println("change object to bytesteam");
	
	file.close();
	object.close();
	
	
	
	}

}
