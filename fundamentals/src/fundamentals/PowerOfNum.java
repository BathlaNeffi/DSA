package fundamentals;
import java.util.Scanner;
public class PowerOfNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int result=1;
		for(int i=1;i<=n;i++)
		{
			result=result*x ;
			
		}
		System.out.println(result);

	}

}
