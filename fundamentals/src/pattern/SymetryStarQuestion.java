package pattern;
import java.util.Scanner;
public class SymetryStarQuestion {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int space=1;
			while(space<=n-i){
				System.out.print(' ');
				space =space+1;

			}
			int j=i;
			while(j<=(2*i)-1){
				System.out.print(j);
				j=j+1;

			}
			int k=2*(i-1);
			
			while(k>=i){
				System.out.print(k);
				k=k-1;

			} 
			System.out.println();
			i=i+1;

		}

		
	}

}
