package co.in.rays.AbstractPractic;

public class Rectangle extends Shape{
	
		private int lenght;
		private int widht;
		public int getLenght() {
			return lenght;
		}
		public void setLenght(int lenght) {
			this.lenght = lenght;
		}
		public int getWidht() {
			return widht;
		}
		public void setWidht(int widht) {
			this.widht = widht;
		}
		public void area() {
			
			int Area = getLenght()*getWidht();
					System.out.println(Area);
			
		}

}
