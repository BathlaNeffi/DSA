package string;

import java.util.Scanner;

public class PalindromeCheck {
	public static void checkPalindrome(String str) {
		String revstr="";
		int n=str.length();
		
		for(int i=0,j=n-1;i<=j;i++) {
			if(str.charAt(i)==str.charAt(j)) {
				
			}
			else {System.out.println("NO");return;} 
			j--;
		}
		System.out.println("yes");
//		for(int i=0;i<str.length();i++) {
//			revstr=str.charAt(i) + revstr;
//		}
//		if(str.compareTo(revstr)==0) {
//			System.out.println("This is Palindrome");
//			
//		}
//		else System.out.println("This is not Palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		checkPalindrome(str);
		

	}

}
