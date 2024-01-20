package in.co.rays.batch;

public class ConstCall {
	
	
	String Name=null;
	String Lastname=null;
	String Address=null;
	
	
	public ConstCall() {
		
		
		System.out.println("this is defult Constructor");
		
	}
	
	public ConstCall(String name,String lastname) {
		
		this.Name=name;
		this.Lastname=lastname;
		
	}
	
	public ConstCall(String name,String lastname,String address) {
		
		this.Name=name;
		this.Lastname=lastname;
		this.Address=address;
		
	
	}
	
	public void Display() {
		
		
		System.out.println("details:"+this.Name +","+this.Lastname+" ,"+this.Address);
		
	}

}
