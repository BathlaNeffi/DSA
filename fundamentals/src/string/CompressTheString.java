package string;

import java.util.Scanner;

public class CompressTheString {
	public static String getCompressedString(String str) {
		char ch=' ';
		String sol=str.charAt(0)+"";
		int k=1;
		for(int i=1;i<str.length();i++) {
			

			if(str.charAt(i)==str.charAt(i-1)){k++; continue;}
			else {
				if(k>1) {sol += k; k=1;}
				}
			sol +=str.charAt(i);
			
		}
		if(k>1) {sol += k; k=1;}
		return sol;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(getCompressedString(str));


	}

}
