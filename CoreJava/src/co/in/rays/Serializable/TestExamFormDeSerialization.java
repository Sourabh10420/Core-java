package co.in.rays.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestExamFormDeSerialization {
	
	public static void main(String[] args) {
		try {
		
		FileInputStream in = new FileInputStream("C:\\Users\\hp\\Desktop\\sourabh1\\Serialization.txt");
		
		
		ObjectInputStream obj = new ObjectInputStream(in);
		
		
		ExamForm Ef = (ExamForm) obj.readObject();
		
		
		System.out.println(Ef.username);
		System.out.println(Ef.userlastname);
		System.out.println(Ef.rollnum);
		System.out.println(Ef.Dsnumber);
		System.out.println(Ef.Examdate);
	}catch(Exception e) {
		
		System.out.println(e);
	}
		

	}
}
