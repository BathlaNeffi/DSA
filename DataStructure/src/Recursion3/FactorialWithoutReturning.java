package Recursion3;

public class FactorialWithoutReturning {
	
	public static void factorial(int input, int answer) {
		if(input==0) {
			System.out.println(answer);
			return;
		}
		
		answer*=input;
		factorial(input-1, answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		factorial(n,1);

	}

}
