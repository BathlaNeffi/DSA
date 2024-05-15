package functions;

import java.util.Scanner;


public class Test2Probabalility {
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
			}
		return fact;
	}
	public static int power(int num) {
		int pow=1;
		for(int i=1; i<=num;i++) {
			pow*=2;
		}
		return pow;
	}

	public static int probability (int n, int x) {
		double factN=factorial(n);
		double factX=factorial(x);
		double factNX=factorial(n-x);
		double c=factN/(factX*factNX);
		double pow=power(n);
//		System.out.print(c+" c ");
//		System.out.println(pow+"pwo");
		double prob=c/pow;
		int percentage=(int)(prob*100);
		return percentage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x=s.nextInt();
		System.out.println(probability(n,x));

	}

}
