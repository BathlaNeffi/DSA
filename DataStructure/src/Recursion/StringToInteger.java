package Recursion;

import java.util.Scanner;

public class StringToInteger {
	
	public static int convertStringToInt(String str) {
		if(str.length()==1) { 
			int value=str.charAt(0)-'0';
			return value;
					}
	int smallstr=convertStringToInt(str.substring(0,str.length()-1));
	int sol= str.charAt(str.length()-1)-'0';
	
	return smallstr*10 + sol;
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(convertStringToInt(str));
		
		
		
		
		
		

	}

}
