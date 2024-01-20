package co.in.rays.LadderIfElse;
public class Gst{
public static void main(String[] args){
int amount=30000;

if(amount<=10000){
	System.out.println("Gst rate is 15%");
}
else if(amount<=100000){
	System.out.println("Gst rate is 18%");
}
else{
	System.out.println("Gst rate is 20%");
}
}
}