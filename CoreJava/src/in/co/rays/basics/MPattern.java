package in.co.rays.basics;
import java.util.*;

public class MPattern {
	public static void main(String[] args) { 
		int x = 1;
			for (int i = 1; i <=15; i++) {
				for (int j = 0; j <=15; j++) {
					if(j==1||j==15||(j==x||j==15-x+1)) {
						System.out.print("M");
					}
					else {
						System.out.print(" ");
					}
				}
				x++;
				System.out.println();
				
			}
	}
}
