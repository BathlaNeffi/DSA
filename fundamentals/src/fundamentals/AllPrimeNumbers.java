package fundamentals;
import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int n=2;n<=num;n++) {
			int div=2;
			for(;div<n;div++) {
				
				if(n%div==0) {
					break;
				}
				
				
				
			}
			if(div==n) {
			System.out.println(n);
			}
			else {continue;}
		}

	}

}
