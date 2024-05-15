package string;

import java.util.Scanner;

public class CheckPermutation {
	
	public static boolean permutation(String str1, String str2) {
		boolean ispermutation=true;
		if(str1.length()!=str2.length()) {ispermutation=false; return ispermutation;}
		int [] freq=new int[256];
		for(int i=0;i<str1.length();i++) {
			int k=(int)(str1.charAt(i));
			freq[k]+=1;
		}
		for(int i=0;i<str1.length();i++) {
			int k=(int)(str2.charAt(i));
			freq[k]-=1;
		}
		
		for(int i=0;i<256;i++) {
			if(freq[i]!=0) {ispermutation=false;}
		}
		return ispermutation;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		
		System.out.println(permutation(str1, str2));

	}

}
