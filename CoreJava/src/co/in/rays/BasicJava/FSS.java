package co.in.rays.BasicJava;
public class FSS{

	public static void main(String [] args){
	int fabonic=0;
	int number=0;
	
		for(int i=0; fabonic<=100; i++){
			if(i==2){
			number=-1;
			fabonic=number+i;
			System.out.println(fabonic);
			}
			else{
			fabonic=number+i;
			System.out.println(fabonic);
			number++;
			}
		}
		
	}

}