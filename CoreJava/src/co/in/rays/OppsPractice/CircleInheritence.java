package co.in.rays.OppsPractice;

public class CircleInheritence {
		
		private double Redius  = 0;
		
			public void setRedius(double Redius ) {
				this.Redius=Redius;
			}
			public double getRedius() {
				return Redius;
			}
				public void areaOf() {
					double Area = 3.14*getRedius()*getRedius();
					double Perameter=2*3.14*getRedius();
					
						System.out.println("Area of Circle"+"="+ Area);
						System.out.println("Perameter of Circle"+"="+ Perameter);
				}
				
}

