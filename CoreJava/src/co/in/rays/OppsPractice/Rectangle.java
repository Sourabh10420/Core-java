package co.in.rays.OppsPractice;

public class Rectangle extends Shape {
	
	private double Lenght=0.0;
	private double Width= 0.0;
	
	
			public void setLenght(double Lenght) {
				this.Lenght=Lenght;
			}
				public double getLenght() {
					return Lenght;
				}
			public void setWidth(double  Width) {
				this.Width=Width;
			}
				public double getWidth() {
					return Width;
				}
	
				
			public void area() {
				
				  double Area = getLenght()*getWidth();
				  double Perameter = 2*(getLenght() + getWidth());
				 	System.out.println("Area of Rectangle"+"="+Area);
				 	System.out.println("Perameter of Rectangle"+"="+ Perameter);
			}
}
