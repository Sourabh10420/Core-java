package co.in.rays.OppsPractice;

public class ConstracturCall {
	
		int id=0;
		String Name = null;
		String LastName= null;
		
		public ConstracturCall() {
			
			System.out.println("this is Defoult contructur");
			
		}
		public ConstracturCall(int id,String Name) {
			
			this.id=id;
			this.Name=Name;
			
			System.out.println("this is two perameter constructur");
		}
		public ConstracturCall(int id,String Name,String LastName) {
			this.id=id;
			this.Name=Name;
			this.LastName=LastName;
			System.out.println("this is three perameter constructur");
		}
		public void PrintMethod() {
			
			System.out.println("display output-"+this.id+","+this.Name+","+this.LastName);
		}
}
