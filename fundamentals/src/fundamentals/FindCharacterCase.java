package fundamentals;

import java.util.Scanner;

public class FindCharacterCase{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
		char ch=str.charAt(0);
		int i=ch;

		if(i>=97 && i<=122) {
			System.out.println("0");}
		else if(i>=65 && i<=90) {
			System.out.println("1");}
		else {
			System.out.println("-1");}
		
	


	}
}




