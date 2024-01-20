package co.in.rays.OppsPractice;

public class CylenderInheritence extends CircleInheritence  {
		
			private double Redius = 0;
				private double Hight= 0;
			
				public void setRedius(double Redius) {
					this.Redius=Redius;
				}
					public double getRRedius() {
						return Redius;
					}
				public void setHight1(double Hight) {
						this.Hight=Hight;
				}
					public double getHight() {
						return Hight;
					}
				public void areaOff() {
					double AreaOff = 2*3.14*getRedius()*getHight() + 3.14*getRedius()*getRedius()*getHight();
					double Volume = 3.14*getRedius()*getRedius()*getHight();
						System.out.println("Area of Cylender"+"="+ AreaOff);
						System.out.println("Volume of Cylender"+"="+ Volume);
					
				}
}			
