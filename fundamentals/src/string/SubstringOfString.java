package string;

import java.util.Scanner;

public class SubstringOfString {
	public static void subString(String str) {
		int n=str.length();
		for(int j=1;j<=n;j++) {
		for(int i=0;i<=n-j;i++) {
			
		System.out.println(str.subSequence(i, i+j));
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		subString(str);

	}

}
