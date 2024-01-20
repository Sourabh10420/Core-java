package co.in.rays.OppsPractice;

public class TestSetterGetterShape {
	public static void main(String[] args) {
		 SetterGetterShape ss = new  SetterGetterShape();
		 
		 ss.setColor("red");
		 ss.setBoarderWidht(55);
		 ss.setBoarderHight(15);
		 
		 System.out.print(ss.getColor()+"\n"+ss.getBoarderWidht()+"\n"+ss.getBoarderHight());
	}
}