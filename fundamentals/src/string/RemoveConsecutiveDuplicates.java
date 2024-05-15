package string;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String str) {
		char arr[]=new char[246];
		String sol="";
		
		int k=0;
		int i=0;
		for(;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {continue;}
			else {arr[k]=str.charAt(i); k++;}
		}
		arr[k]=str.charAt(i);
		
		for(int j=0;j<=k;j++) {
			sol+=arr[j];
			
		}
		return sol;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String result=removeConsecutiveDuplicates(str);
		System.out.println(result);
		
		

	}

}
