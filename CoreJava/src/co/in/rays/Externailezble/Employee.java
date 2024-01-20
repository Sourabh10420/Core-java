package co.in.rays.Externailezble;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	
	public String id = "1111";
	public String name = "sourabh";
	public String lastname = "mandloi";
	public double salary = 100000;
	 
	
	
	public void readExternal(ObjectInput in) {
		
		try {
			id = (String) in.readObject();
			name = (String) in.readObject();
			lastname = (String) in.readObject();
			salary = (double) in.readObject();
		}catch(Exception e) {
			
			System.out.println(e);
		}
			
		}
	public void writeExternal(ObjectOutput out) {
		
		
		try {
		
		out.writeObject(id);
		out.writeObject(name);
		out.writeObject(lastname);
		out.writeObject(salary);

		
		
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}
		
	}
	
	
	
	


