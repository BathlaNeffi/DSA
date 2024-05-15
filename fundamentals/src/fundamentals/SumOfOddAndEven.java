package fundamentals;
import java.util.Scanner;
public class SumOfOddAndEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int digit;
		int ev=0,odd=0;
		while(n>0)
		{
			digit=n%10;
			n=n/10;
			if(digit%2!=0)
				{odd=odd+digit;}
			else
				{ev=ev+digit;}
		}
		System.out.print(ev+" "+odd);

	}

}
