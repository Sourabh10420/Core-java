package co.in.rays.OppsPractice;

public class ConstructurCall2 {
		
		int PhoneNumber=0;
		char ch =83;
		String Name = null;
		
			public ConstructurCall2(int PhoneNumber,String Name,char ch) {
				this.PhoneNumber=PhoneNumber;
				this.Name=Name;
				this.ch=ch;
				System.out.println("my name start latter and name and phone number");
			}
			public void MyDetails() {
				System.out.println("Details Are:-"+this.ch+","+this.Name+","+this.PhoneNumber);
			}
}
