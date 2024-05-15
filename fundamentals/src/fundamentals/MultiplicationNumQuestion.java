package fundamentals;
import java.util.Scanner;
public class MultiplicationNumQuestion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
//		int multi;
		int i=1;
		
		while(i<=10) {
			int multi=n*i;
					System.out.println(multi);
			i=i+1;
			}
		
		}

	}


