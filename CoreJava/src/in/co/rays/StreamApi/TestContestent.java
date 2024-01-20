package in.co.rays.StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {
	
	public static void main(String[] args) {
		
		
		List<Contestent> list=new ArrayList<Contestent>();
		
		
		list.add(new Contestent("sourabh", "9644382290"));
		list.add(new Contestent("shankar", "9977794689"));
		list.add(new Contestent("ajay", "964438229091"));
		list.add(new Contestent("pooja", "8458910420"));
		list.add(new Contestent("deepak", "919644382290"));
		
		list.add(new Contestent("kundan", "9752810420"));
	list.add(new Contestent("manoj", "9926761360"));
	
	list.stream().map(e->e.phone).filter(e->e.length()==10).collect(Collectors.collectingAndThen(Collectors.toList(), e->{
			
		
		Collections.shuffle(e);
		
		return e.stream();})).limit(3).forEach(e->{
			System.out.println(e);
			
		});
		
		
		
		
		
		
		
	}
	
	

}
