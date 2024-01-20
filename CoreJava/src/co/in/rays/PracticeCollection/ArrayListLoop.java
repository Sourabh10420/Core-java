package co.in.rays.PracticeCollection;

import java.util.ArrayList;

public class ArrayListLoop {

	public static void main(String[] args) {
		
		ArrayList name =new ArrayList();
		
		for (int i = 0; i < args.length; i++) {
			name.add("sourabh"+ i);
			
		
		}
		System.out.println("names ="+ name.size());
	}
}
