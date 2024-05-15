package Recursion;

import java.util.Scanner;

public class StairCase {
	
	
	public static int staircase(int n){
	
         if (n == 0) return 1;
        else if (n == 1) return 1;
        else if (n == 2) return 2;
        else if (n == 3) return 4;
		
		int x=staircase(n-1);
		int y=staircase(n-2);
		int z= staircase(n-3);
		
		return x+y+z;
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(staircase(num));
		
	}

}
