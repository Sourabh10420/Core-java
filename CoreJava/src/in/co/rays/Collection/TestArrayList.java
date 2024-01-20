package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
	
	public static void main(String[] args) {
		
	
	
	List list =new ArrayList();
	
	list.add(20);
	list.add(30);
	list.add(50);
	
	
	System.out.println(list);
	
	
     Iterator it=list.iterator();
     list.add(80);
     
     while(it.hasNext());
     
     System.out.println(it.next());
    
     
     //System.out.println(list);
	}	

  
	
}
