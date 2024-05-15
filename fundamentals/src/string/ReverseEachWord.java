package string;

import java.util.Scanner;

public class ReverseEachWord {

	public static void reverse(String str) {
		int n=str.length();
		String ans="";
		int startword=0;
		int i=0;
		for(;i<n;i++) {
			if(str.charAt(i)==' '){
				int endword=i-1;
				String reverseword="";
				while(startword<=endword) {

					reverseword=str.charAt(startword) + reverseword;
					//					System.out.println(reverseword);
					startword++;
				}
				ans +=reverseword +" ";
				startword=i+1;


			}
			

		}

		int endword=i-1;
		String reverseword="";
		while(startword<=endword) {

			reverseword=str.charAt(startword) + reverseword;
			//					System.out.println(reverseword);
			startword++;
		}
		ans +=reverseword +" ";
		startword=i+1;
		
		System.out.println(ans);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		reverse(str);
		//		System.out.println(str);

	}

}
