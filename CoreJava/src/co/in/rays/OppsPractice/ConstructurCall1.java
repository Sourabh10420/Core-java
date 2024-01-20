package co.in.rays.OppsPractice;

public class ConstructurCall1 {
			
			int Roll = 0;
			int DSNumber = 0;
			int className=0;
			String ExamName=null;
			int DateOfExam=0;
			String CollageName= null;
			
		public ConstructurCall1 (int Roll) {
			this.Roll=Roll;
		
			System.out.println("this is my roll number");
		}
		public ConstructurCall1 (int DSNumber,int className) {
			this.className=className;
			this.DSNumber=DSNumber;
			System.out.println("this is my class and Ds Number");
		}
		public ConstructurCall1(int DateOfExam,String ExamName,String CollageName) {
			this.ExamName=ExamName;
			this.CollageName=CollageName;
			this.DateOfExam=DateOfExam;
			System.out.println("this is my collage name, exam name and date of exam");
		}
		public void PersnalImformation() {
			System.out.println("My Details are:-"+this.ExamName+","+this.className+","+this.CollageName+","+this.DateOfExam+","+this.Roll+","+this.DSNumber);
		}
}
