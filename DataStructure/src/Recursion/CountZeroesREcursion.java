package Recursion;

import java.util.Scanner;

public class CountZeroesREcursion {

	public static int countZerosRec(int input) {
		if(input<10) {
			if(input%10==0)return 1;	
			else return 0;}
		int check=0;
		if(input%10==0) {check++;}
		
		int count=countZerosRec(input/10) ;
		return count+ check;
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(countZerosRec(num));

	}

}
