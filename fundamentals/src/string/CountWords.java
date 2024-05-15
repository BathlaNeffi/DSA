package string;

import java.util.Scanner;

public class CountWords {
	public static void printChar(String str) {
		int k=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {k++;}}
		
		System.out.println(k);
	}


	public static void main(String[] args) {
		//		String str="Neffi";
		//		String a ="abcd";
		//		String b="dabc";
		//		System.out.println(a.compareTo(b));

		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		printChar(str);
//		char ch=str.charAt(0);
//		System.out.println(ch);




	}

}
