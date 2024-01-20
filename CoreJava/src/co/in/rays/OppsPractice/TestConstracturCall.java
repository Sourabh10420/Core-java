package co.in.rays.OppsPractice;

public class TestConstracturCall {
	public static void main(String[] args) {
		ConstracturCall c = new ConstracturCall();
		ConstracturCall c1 = new ConstracturCall(101,"sourabh");
		ConstracturCall c2 = new ConstracturCall(101,"sourabh","mandloi");
		
		c.PrintMethod();
		c1.PrintMethod();
		c2.PrintMethod();
		
	}
}
