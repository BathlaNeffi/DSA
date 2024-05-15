package functions;

import java.util.Scanner;

public class MaximumNumber {
	
	public static int maxNum(int num) {
		int max1 = 0;
		int max=0;
        for (int i = 1; i < num; i *= 10) {
            max1= (num % i + num / (i * 10) * i);
            if(max1>=max) {
            	max=max1;
            	
            }
        }
        return max;
           }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		
		System.out.println(maxNum(num));
		
			
		

	}

}
