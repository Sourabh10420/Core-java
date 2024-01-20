package co.in.rays.LadderIfElse;
public class Alphabets{
public static void main(String[] args){

char value=97;

if(value>=65&&value<=90){
	System.out.println("Givin AscII value of Uppercase alphabets");
}
else if(value>=97&&value<=122){

	System.out.println("Givin AscII value of Lowercase alphabets");
}
else{
	System.out.println("Givin AscII value of Special Charecter ");
}
}
}