package pattern;
import java.util.Scanner;
public class CharacterTringualarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i = 1;
		char chr='A';
		int k=num;

		while (i <= num) {
			int j = 1;
			while (j <= i) {
				System.out.print((char)(chr+k +j-2));
				j = j + 1;

			}
			System.out.println();
			i = i + 1;
			k=k-1;

		}
	}

}
