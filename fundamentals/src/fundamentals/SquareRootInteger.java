package fundamentals;

import java.util.Scanner;

public class SquareRootInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sqrt=1;
		int i=1;
		for(;;i++) {
			
			sqrt=i*i;
			if(sqrt>num) {
				break;
			}
			
			
		}
		System.out.println(i-1);
		

	}

}
