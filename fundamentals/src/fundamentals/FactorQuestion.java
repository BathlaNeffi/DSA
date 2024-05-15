package fundamentals;
import java.util.Scanner;
public class FactorQuestion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int div=2;
		while (div<=num-1)
		{
			if(num%div ==0)
				System.out.print(div+ " ");
			div=div+1;
		}

	}

}
