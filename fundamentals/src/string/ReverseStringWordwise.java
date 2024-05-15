package string;

import java.util.Scanner;

public class ReverseStringWordwise {

	public static void reverseWordWise(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			result=str.charAt(i) + result;
		}







		String ans="";
		int startword=0;
		int i=0;
		for(;i<result.length();i++) {
			if(result.charAt(i)==' '){
				int endword=i-1;
				String reverseword="";
				while(startword<=endword) {

					reverseword=result.charAt(startword) + reverseword;
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

			reverseword=result.charAt(startword) + reverseword;
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
		reverseWordWise(str);


	}

}
