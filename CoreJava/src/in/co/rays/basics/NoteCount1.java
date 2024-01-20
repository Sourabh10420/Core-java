package in.co.rays.basics;

public class NoteCount1 {
	public static void main(String[] args) {
		int n = 246576;
		int count=0;
		int []notes= {500,200,100,50,20,10,5,2};
				for (int i = 0; i < notes.length; i++) {
				count=n/notes[i];
				n=n%notes[i];
				
			if (count>0) {
				System.out.println(notes[i]+"="+count);
			}
				}
		}
	}

