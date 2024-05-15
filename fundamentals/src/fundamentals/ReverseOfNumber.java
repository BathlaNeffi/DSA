package fundamentals;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rev=0;
		
		
		for(int number=num;number>0;) {
			
	
		int remainder=number%10;
		rev=rev*10 +remainder;
		number=number/10;

				
		}
		
		System.out.println(rev);
		

	}

}
