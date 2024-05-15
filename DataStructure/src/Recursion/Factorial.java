package Recursion;
import java.util.*;

public class Factorial {
	
	public static int fact(int n) {
		if(n==0) {return 1;}
		
		int smalloutput=fact(n-1);
		int output=n*smalloutput;
		
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(fact(n));
		

	}

}
