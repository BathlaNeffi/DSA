package Recursion;

import java.util.Scanner;
import java.text.*;

public class GeometricSum {
	public static int power(int n,int num) {
		if(n==0) {return 1;}
		int small=power(n-1,num);
		int val=small*num;
		return val;
	}
	
	public static double findGeometricSum(int k) {
		
		if(k==0) {return 1.0;}
//		DecimalFormat df_obj = new DecimalFormat("#.######");
		double smallSum=findGeometricSum(k-1);
//		df_obj.format(smallSum);
		double Sum=smallSum +(1.0/(double)(power(k,2)));
		
//		df_obj.format(Sum);
		return Sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		System.out.println(findGeometricSum(n-1));
		System.out.format("%.5f",findGeometricSum(n));
		

	}

}
