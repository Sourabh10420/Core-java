package co.in.rays.StreamApiPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestInteger {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,4,5,6,4,6,6,67,7);
		
		Stream<Integer> stream = list.stream();
		
		stream.distinct().sorted().forEach(e->{
			
			
			
			System.out.println(e);
			
		});
	} 

}
