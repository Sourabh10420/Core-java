package co.in.rays.ArrayBasic;

	public class StringArrayBubbleShort {
		public static void main(String[] args) {

			String temp; int flag = 0;

			String [] a = {"sourabh","muskan","laxmi","ranjna","shankarlal"};
						
							for (int i = 0; i <a.length; i++) {
								for (int j = i+1; j <a.length-1-i; j++) {
									if(a[i].compareTo(a[j])>0) {
											temp=a[i];
											a[i]=a[j];
											a[j]=temp;
											flag=1;
									}
								}
								if(flag==0) {
								break;
								}
							}
									for (int i = 0; i <a.length; i++) {
											System.out.print(a[i]+",");
					}
		}

			
		}
		


