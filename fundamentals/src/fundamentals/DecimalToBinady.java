package fundamentals;

import java.util.Scanner;

public class DecimalToBinady {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		long rev=1;
		

		for(long number=num;number>0;) {


			long remainder=number%2;
			rev=rev*10 +remainder;
			number=number/2;


		}
		
		long value=rev;

		long rev2=0;


		for(long number=value;number>0;) {


			long remainder=number%10;
			rev2=rev2*10 +remainder;
			number=number/10;


		}
		System.out.println(rev2/10);


	}

}
