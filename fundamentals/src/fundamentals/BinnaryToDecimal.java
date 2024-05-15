package fundamentals;

import java.util.Scanner;

public class BinnaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int decimal=0;
		int prod=1;
		for(int number=num;number!=0;) {
			
			
			
			int remainder=number%10;
			decimal= remainder*prod +decimal;
			number=number/10;
			prod=prod*2;
				
			
		}
		System.out.println(decimal);

	}

}
