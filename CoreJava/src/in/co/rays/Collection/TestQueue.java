package in.co.rays.Collection;

import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {
	public static void main(String[] args) {
		
		
		ArrayBlockingQueue a= new ArrayBlockingQueue(10);
		
		
		
		a.add(10);
		
		a.add(20);
		a.add(30);
		a.add(40);
		
		System.out.println(a);
		

	}
	

}
