package co.in.rays.NestedIfELse;
public class LargestNumberAmongFourNumber{
public static void main(String[] args){

int a=5;
int b=7;
int c=10;
int d=10;


if(a>=b){
	if(a==b){
		if(a>=c){
			if(a==c){
				if(a>=d){
					if(a==d){
					System.out.println("the given four Number are equal ");
					}
					else{
					System.out.println("the largest Number is a ,b and c And all three are equal");
					}
				}
				else{
				System.out.println("the largest Number is d and a,b and c the three are equal");
				}
			}
			else if(a>=d){
				if(a==d){
				System.out.println("the largset Number is a,b,d and both are equal");
				}
				else{
				System.out.println("the largest Number is a and b,and both are equal");
				}					
			}
			else{
			System.out.println("the largest Number is d. and a b is equal");
			}
		}
		else if(c>=d){
			if(c==d){
			System.out.println("the largest Number is c and d. and a or b equal and c or d equal ");
			}
			else{
			System.out.println("the largest Number is c . and a or b equal");
			}
		}
		else{
		System.out.println("the largest Number is d. and a or b equal");
		}
	}
	else if(a>=c){
		if(a==c){
			if(a>=d){
				if(a==d){
				System.out.println("the largest Number is a ,c ,d. and a, c, d both are equal");
				}
				else{
				System.out.println("the largest Number is a,c and a,c both are equal");
				}
			}
			else{
			System.out.println("the largest Number is d . and a,c both are equal");
			}
		}
		else if(a>=d){
			if(a==d){
			System.out.println("the largest Number is a,d. and a,d both are equal");
			}
			else{
			System.out.println("the largest Number is a.");
			}
		}
		else{
		System.out.println("the largest Number is d.");
		}
	}
	else if(c>=d){
		if(c==d){
		System.out.println("the largest Number is c,d . and c,d both are equal");
		}
		else{
		System.out.println("the largest Number is c.");
		}
	}
	else{
	System.out.println("the largest Number is d.");
	}
}
else if(b>=c){
	if(b==c){
		if(b>=d){
			if(b==d){
			System.out.println("the largest Number is b,c,d. and both are equal");
			}
			else{
			System.out.println("the largest Number is b,c . and b,c are equal");
			}
		}
		else{
		System.out.println("the largest Number is d. and b,c are equal ");
		}
	}
	else if(b>=d){
		if(b==d){
		System.out.println("the largest Number is b,d . and both are equal");
		}
		else{
		System.out.println("the largest Number is b.");
		}
	}
	else{
	System.out.println("the largest Number is d.");
	}
}
else if(c>=d){
	if(c==d){
	System.out.println("the largest Number is c,d . and both are equal");
	}
	else{
	System.out.println("the largest Number is c.");
	}
}
else{
System.out.println("the largest Number is d.");
}

}
}