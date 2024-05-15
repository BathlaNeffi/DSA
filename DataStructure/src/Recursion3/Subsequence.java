package Recursion3;

import java.util.ArrayList;

public class Subsequence {
	
	
	
	public static ArrayList<String> subsequenceOfString(String str) {
		
		if(str.length()==0) {
			ArrayList<String> s=new ArrayList<>();
			s.add(" ");
			return s;
		}
		char a=str.charAt(0);
		ArrayList<String> so=subsequenceOfString(str.substring(1));
		int temp=so.size();
		for(int i=0; i<temp;i++) {
			so.add(so.get(i)+a);
		}
		return so;

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abc";
		
		ArrayList<String> temp=subsequenceOfString(str);
		System.out.println(temp);
		
		

	}

}
