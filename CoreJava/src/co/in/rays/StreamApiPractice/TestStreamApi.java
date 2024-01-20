package co.in.rays.StreamApiPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamApi {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ONE","TWENTY","THREE","TEN","TWO","THIRTY","FOUR","FIVE","TEN","TWO");
		
		Stream<String> stream = list.stream();
		
		stream.map(e->e.toLowerCase()).filter(e->e.startsWith("t")).sorted().distinct().forEach(e->{
			
			System.out.println(e);
		});
		
	}
}


