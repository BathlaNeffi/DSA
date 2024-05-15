package Recursion;

import java.util.Scanner;

public class ReplaceCharacter {
	
	public static String replaceChar(String str, char in, char re) {
		if(str.length()==0) {return str ;}
		
		String smallString= replaceChar(str.substring(1), in, re);
		if(str.charAt(0)==in) {
			return re+smallString;
		}
		else {
			return str.charAt(0) + smallString;
		}
	}

	public static String pireplace(String str) {
		if(str.length()<=1) {return str;}
		
		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
			// this condition is when we got p and i both we will go for n-2 string after this.
			
			String smallString=pireplace(str.substring(2));
			return "3.14"+smallString;
					}
		else {
			//here we will think about that case where the value is not matched and we can run recrusion for n-1
			String smallString=pireplace(str.substring(1));
			return str.charAt(0)+smallString;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		String str=s.next();
//		String a=s.next();
//		String b=s.next();
//		char in=a.charAt(0);
//		char re=b.charAt(0);
//		System.out.println(replaceChar(str, in, re));
		
		System.out.println(pireplace("apppipipxcdfpipipiippi"));
		

	}

}
