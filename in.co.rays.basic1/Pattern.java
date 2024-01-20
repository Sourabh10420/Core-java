public class Pattern{
	public static void main(String[] args){
	int i,j;	
	for(i=0;i<=7;i++)
	{
		for(j=0;j<=7;j++)
		{
		if(j>4-i && j<4+i)
		System.out.print("*");
		if(i>4){
		if(j>i-4 && j<11-i)
		System.out.print("*");	
		}

		}
		System.out.println();
	}	

}


}