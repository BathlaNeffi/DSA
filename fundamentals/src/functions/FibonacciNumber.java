package functions;

import java.util.Scanner;



public class FibonacciNumber {
	public static boolean fab(int num) {
		int a=0;
		int b=1;
		if(num==0 || num==1) {return true;}
		boolean isfab=false;
		for(int i=1;i<=num;i++) {
			int c=a+b;
			if(c==num) { isfab=true;
				
			}
			a=b;
			b=c;
			
			
		}
		return isfab;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fab(n));

	}

}
