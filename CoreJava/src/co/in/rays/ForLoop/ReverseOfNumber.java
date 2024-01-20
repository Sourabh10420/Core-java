package co.in.rays.ForLoop;
public class ReverseOfNumber{

public static void main(String[] args){

int number=2345;
int reverse;
for(int i=1; number>=1; i++){
reverse=number%10;
number=number/10;
System.out.print(reverse);
}
}

}