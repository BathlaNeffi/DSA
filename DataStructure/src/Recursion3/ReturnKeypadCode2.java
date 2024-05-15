package Recursion3;

import java.util.Scanner;



public class ReturnKeypadCode2 {
	
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
	
	
	
	
	public static String[] keypadCombination(int input) {
		if(input==0) {
			String[] str=new String[1];
			str[0]="";
			return str;
		}
		
		String [] smallOutput=keypadCombination(input/10);
		int lastDigit=input%10;
		String lastDigitOptions=getOptions(lastDigit);
		String[] output=new String[smallOutput.length*lastDigitOptions.length()];
		int k=0;
		for(int i=0; i<smallOutput.length;i++) {
			
			for(int j=0; j<lastDigitOptions.length();j++) {
				output[k]=smallOutput[i]+lastDigitOptions.charAt(j);
				k++;
			}
		}
		return output;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		String []str=keypadCombination(n);
		
		for(String i:str) {
			System.out.println(i);
		}

	}

}
