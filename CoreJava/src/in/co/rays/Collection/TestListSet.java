package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.List;

public class TestListSet {
	
	public static void main(String[] args) {
		
	
	
	
	List list = new ArrayList();
	
	
	list.add(20);
	list.add('r');
	list.add("pooja");
	list.add("true");
	list.add("Sourabh");
	System.out.println("list="+list);
	
	System.out.println(list.get(0));
	
	
	list.set(2, "Sourabh");
	
	System.out.println("list="+list);
	
	
	System.out.println("index of="+list.indexOf("Sourabh"));
	
	System.out.println("last index of="+list.lastIndexOf("Sourabh"));
	
	
	
	
	}
}
