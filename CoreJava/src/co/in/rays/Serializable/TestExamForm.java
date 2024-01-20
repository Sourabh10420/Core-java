package co.in.rays.Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestExamForm {
	
	public static void main(String[] args) {
		
		try {
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\hp\\Desktop\\sourabh1\\Serialization.txt");
		
		ObjectOutputStream obj = new ObjectOutputStream(out);
		
		
		ExamForm Ef =new ExamForm();
		
		Ef.username=("Sourabh");
		Ef.userlastname=("Mandloi");
		Ef.rollnum=1256;
		Ef.Examdate="22/02/2024";
		Ef.Dsnumber="DS/1243/3454";
		
		obj.writeObject(Ef);
		
		System.out.println("Change object to by String");
		
		out.close();
		obj.close();
	}catch(Exception e) {
		System.out.println(e);
	}
		
		
	}

}
