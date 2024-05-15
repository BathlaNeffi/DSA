package Recursion3;

import java.util.Scanner;

public class KeypadCombinationwithoutReturn {
	
	
	
public static String getOptions(int n) {
		
		switch (n) {
		case 2: {
			
			return "abc";
		}
		case 3:{
			return"def";
		}
		case 4:{
			return "ghi";
		}
		case 5:{
			return"jkl";
		}
		case  6:{
			return "mno";
		}
		case 7:{
			return "pqrs";
		}
		case 8:{
			return "tuv";
		}
		case 9:{
			return "wxyz";
		}
		default:
			return "";
		}
		
	}
	
	
	
	
	public static void printKeypad2(int input,String soFar) {
		if(input==0) {
		System.out.println(soFar);
		return;
		}
		
		int current=input%10;
		
		String str=getOptions(current);
		if(str.equals("")) {
			printKeypad2(input/10,soFar);
		}
		else {
		
		for(int i=0; i<str.length();i++) {
		
		printKeypad2(input/10, soFar+str.charAt(i));
		}
		}
	} 
	
	
	public static void printKeypad(int input){
		// Write your code here
		printKeypad2(input,"");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		printKeypad(n);
		
		

	}

}
