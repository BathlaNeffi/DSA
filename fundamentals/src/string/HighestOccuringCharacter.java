package string;

import java.util.Scanner;

public class HighestOccuringCharacter {
	public static char highestOccuringChar(String str) {
		int freq[]= new int [256];
		
		for(int i=0;i<str.length();i++) {
			freq[(int)(str.charAt(i))] +=1;
		}
		char ch=str.charAt(0);
		int max=freq[(int)ch];
		
		for(int i=0;i<str.length();i++) {
			if(freq[(int)(str.charAt(i))] >max) {
				max=freq[(int)(str.charAt(i))];
				ch=str.charAt(i);
				
			}
			
		}
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(highestOccuringChar(str));
		

	}

}
