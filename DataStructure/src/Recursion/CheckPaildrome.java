package Recursion;

import java.util.Scanner;

public class CheckPaildrome {
	
	public static boolean isPalidrome(String input,int si,int ei) {
		if(ei<si) {return true;}
		
		if(input.charAt(si)==input.charAt(ei)) {
		
		return isPalidrome(input, si+1, ei-1);
		}
		else return false;
	}
	
	public static boolean isStringPalindrome(String input) {
		return isPalidrome(input, 0, input.length()-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(isStringPalindrome(str));

	}

}
