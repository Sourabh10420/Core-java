package co.in.rays.PracticeCollection;
import java.util.Scanner;
public class ListByRegularArray {

	public static void main(String[] args) {
		System.out.println("Enter Array Size");
		Scanner sc =new Scanner(System.in);
		int size;
		size = sc.nextInt();
				
		String [] name = new String[size];
		
		System.out.println("print Random Element");
		
			for (int i = 0; i < name.length; i++) {
				 name[i]= "sourabh"+i;
			
			System.out.println("names="+name[i]);
			}
	}
	
}
