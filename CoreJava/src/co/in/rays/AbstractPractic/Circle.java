package co.in.rays.AbstractPractic;

public class Circle extends Shape {
	
		private int Redius;

		public int getRedius() {
			return Redius;
		}

		public void setRedius(int redius) {
			Redius = redius;
		}
		public void area() {
		double	Area = 3.14*getRedius()*getRedius();
			System.out.println(Area);
		}
		

}
