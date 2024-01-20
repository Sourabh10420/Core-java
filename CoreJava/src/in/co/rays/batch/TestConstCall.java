package in.co.rays.batch;

public class TestConstCall {
	
	public static void main(String[] args) {
		
		ConstCall c=new ConstCall();
		
		ConstCall c1=new ConstCall("Rahul","gurjar");
		
		ConstCall c2=new ConstCall("Rahul","gurjar","indore");
		
		c.Display();
	c1.Display();
	
	c2.Display();
	
	}

}
